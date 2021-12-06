package com.customerapp.web.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

@RestController//@RestController= @Controller+@ResponseBody(convert java -->json)
@RequestMapping(path = "api")
public class EmployeeRestController2 {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeRestController2(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	//---------------getting all employee------------
	@GetMapping(path="employees")
	public ResponseEntity<List<Employee>> getAll(){
		return ResponseEntity.ok(employeeService.getAllEmployee());
		
	}
	
	//---------------getting rec of one employee------------
	@GetMapping(path="employees/{id}")
	public ResponseEntity<Employee> getAnEmployee(@PathVariable(name = "id")int id){
		return ResponseEntity.ok(employeeService.getById(id));
	}
	
	//--------------post ----------
	@PostMapping(path="employees")
	public ResponseEntity<Employee> postEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	}
	//---------------delete------------
	@DeleteMapping(path="employees/{id}")
	public ResponseEntity<String> deleteAnEmployee(@PathVariable(name = "id")int id){
		 employeeService.deleteEmployee(id);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).body("emp with id "+ id +" is deleted");
	}
	//--------------------update------------
	
	@PutMapping(path="employees/{id}")
	public ResponseEntity<Employee> updateAnEmployee(@PathVariable(name = "id")int id, @RequestBody Employee employee){
		 employeeService.update(id, employee);
		 return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	}
	
}




