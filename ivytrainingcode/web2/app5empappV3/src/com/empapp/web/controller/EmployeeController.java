package com.empapp.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empapp.persistance.employee.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService employeeService = new EmployeeServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("showall")) {
			request.setAttribute("employees", employeeService.getAllEmployees());
			RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
			rd.forward(request, response);
		}
		else if (action.equalsIgnoreCase("addemp")) {
			request.getRequestDispatcher("addemp.jsp").forward(request, response);
		} 
		
		else if (action.equalsIgnoreCase("delete")) {
			int eid = Integer.parseInt(request.getParameter("eid").trim());
			employeeService.deleteEmployee(eid);
			response.sendRedirect("empController.do?action=showall");
		} 
		
		else if (action.equalsIgnoreCase("update")) {
			int eid = Integer.parseInt(request.getParameter("eid").trim());
			Employee emp = employeeService.getById(eid);
			request.setAttribute("emp", emp);
			request.getRequestDispatcher("updateemp.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int eid = Integer.parseInt(request.getParameter("eid").trim());
		String ename = request.getParameter("ename");
		Double salary = Double.parseDouble(request.getParameter("salary"));
		Employee employee = new Employee(ename, salary);
		// new customer record
		if (eid == 0) {
			employeeService.addEmployee(employee);
		} else {
			employeeService.updateEmployee(eid, employee);
		}

		response.sendRedirect("empController.do?action=showall");// now we are following PRG dp
		
		
//		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
//		rd.forward(request, response);

	}
}
