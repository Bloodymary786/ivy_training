package com.customerapp.web.controller;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customerapp.dao.Employee;
import com.customerapp.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("demo.xml");
		EmployeeService employeeService = (EmployeeService) ctx.getBean("empService");

		 Employee emp=new Employee("seema", 54000);
		employeeService.addEmployee(emp);

//		List<Employee> employees=employeeService.getAllEmployee();
//		for(Employee employee:employees) {
//			System.out.println(employee);
//		}

		Employee employee = employeeService.getById(1);
		System.out.println(employee);

//		employee.setSalary(78000);
//		employeeService.update(1, employee);
		
		//employeeService.deleteEmployee(1);
	}
}
