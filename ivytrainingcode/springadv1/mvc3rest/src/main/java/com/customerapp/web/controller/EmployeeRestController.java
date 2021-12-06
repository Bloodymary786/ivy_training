package com.customerapp.web.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerapp.dao.Employee;
import com.customerapp.service.EmployeeService;
//	api/employees

//@RequestBody: it is used to convert a json ---> java object
//@ResponseBody: it is used to convert java -->json object

//@RestController//@RestController= @Controller+@ResponseBody(convert java -->json)
//@RequestMapping(path = "api")
public class EmployeeRestController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	//---------------getting all employee------------
	@GetMapping(path="employees")
	public List<Employee> getAll(){
		return employeeService.getAllEmployee();
	}
	
	//---------------getting rec of one employee------------
	@GetMapping(path="employees/{id}")
	public Employee getAnEmployee(@PathVariable(name = "id")int id){
		return employeeService.getById(id);
	}
	
	//--------------post ----------
	@PostMapping(path="employees")
	public Employee postEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return employee;
	}
	//---------------delete------------
	@DeleteMapping(path="employees/{id}")
	public Employee deleteAnEmployee(@PathVariable(name = "id")int id){
		return employeeService.deleteEmployee(id);
	}
	//--------------------update------------
	
	@PutMapping(path="employees/{id}")
	public Employee updateAnEmployee(@PathVariable(name = "id")int id, @RequestBody Employee employee){
		return employeeService.update(id, employee);
	}
	
}




