package com.customerapp.web.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerapp.dao.Employee;
import com.customerapp.service.EmployeeService;
//	api/employees
@RestController//@RestController= @Controller+@ResponseBody(convert java -->json)
@RequestMapping(path = "api")
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
	
	//---------------delete------------
	
	//--------------------update------------
	
}
