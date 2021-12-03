package com.customerapp.web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customerapp.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
		EmployeeService employeeService=(EmployeeService) ctx.getBean("empService");
		employeeService.deleteEmployee(2);
	}
}
