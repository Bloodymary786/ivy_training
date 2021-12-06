package com.empapp.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empapp.model.dao.Employee;
import com.empapp.model.dao.EmployeeDao;
import com.empapp.model.dao.EmployeeDaoImpl;

@WebServlet("/employeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao dao=new EmployeeDaoImpl();
	
	//get method to load the jsp
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("emp.jsp").forward(request, response);
	}

	//post method is called after form is sumbitted...
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/* Spring mvc provide automatic: data validation , data buffering, data converion
		 * 
		 * 1. u need to use req.getParameter to get the data from the form manually :( 
		 * 2. u need to convet the datatype manually :(
		 * 3. u need to write compilcated server side validation code
		 */
		String name=request.getParameter("name");
		String salaryStr=request.getParameter("salary");
		
		
		Double salary= Double.parseDouble(salaryStr);
		
		Employee employee=new Employee(name, salary);
		dao.addEmployee(employee);
		
		response.sendRedirect("success.jsp");
	}

}




