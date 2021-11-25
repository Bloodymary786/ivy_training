package com.empapp.web;

import com.empapp.config.AppConfig;
import com.empapp.persistance.Employee;
import com.empapp.persistance.EmployeeNotFoundException;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmployeeController {

	public static void main(String[] args) {
		
//		ApplicationContext applicationContext=
//				new ClassPathXmlApplicationContext("beans.xml");
//		
		AnnotationConfigApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService employeeService=(EmployeeService) applicationContext.getBean("empService");
		
		List<Employee>employees=employeeService.getAllEmployees();
		
		System.out.println("------------all employees----------");
		for(Employee employee: employees) {
			System.out.println(employee);
		}
		
//		System.out.println("-----------get by id-----------------");
//		try{
//			Employee employee=employeeService.getById(29);
//			System.out.println(employee);
//		}catch(EmployeeNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
		
//		System.out.println("--------update ---------------");
//		
//		Employee employee=employeeService.getById(2);
//		employee.setSalary(72);
//		employeeService.updateEmployee(2, employee);
		
		//System.out.println("--------------delete -----------------");
		//employeeService.deleteEmployee(4);
		
	}
}
