package com.customerapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.customerapp.dao.Employee;
import com.customerapp.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	@GetMapping
	public String welcome() {
		return "redirect:viewall";
	}
	
	//---------------update operation------
	
	@GetMapping(path = "updateEmp")
	public String getUpdateEmp(ModelMap map, @RequestParam(name = "id")int id) {
		Employee employee=employeeService.getById(id);
		map.addAttribute("employee", employee);
		return "empupdate";
	}
	
	
	
	
	
	
	//-------------------Get Operation----------------------
	//i need to write the code to display all employees
	@GetMapping(path = "viewall")
	public ModelAndView showAllEmployee(ModelAndView mv) {
		mv.addObject("employees", employeeService.getAllEmployee());
		mv.setViewName("viewall");
		return mv;
	}
	
	//deleteEmp?id=2
	//-------------------delete Operation----------------------
	@GetMapping(path = "deleteEmp")
	public String deleteEmp(@RequestParam(name = "id")int id) {
		employeeService.deleteEmployee(id);
		return "redirect:viewall";
	}
	
	
	//-------------------adding Operation----------------------
	//Post operation :2 method ? one method offer u the form sec method will process that form
	@GetMapping(path = "addEmployee")
	public String getPostForm(ModelMap map) {
		Employee employee=new Employee();//? backing form bean? it is a pojo object that is used to capture the form data
		map.addAttribute("employee", employee);
		return "addemp";
	}
	
	//PRG pattern : after post redirect to get
	@PostMapping(path = "addEmployee")
	public String postEmp(@ModelAttribute(value ="employee" )Employee employee) {
		int id=employee.getId();
		if(id==0) {
		employeeService.addEmployee(employee);
		}else {
			employeeService.update(id, employee);
		}
		return "redirect:viewall";//PRG
	}
}
















