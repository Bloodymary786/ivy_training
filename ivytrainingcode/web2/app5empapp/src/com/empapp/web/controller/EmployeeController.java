package com.empapp.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empapp.persistance.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;


public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String ename=request.getParameter("ename");
		Double salary= Double.parseDouble(request.getParameter("salary"));
		
		Employee employee=new Employee(ename, salary);
		
		employeeService.addEmployee(employee);
		response.sendRedirect("success.jsp");// now we are following PRG dp
//		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
//		rd.forward(request, response);
		
	}

}
