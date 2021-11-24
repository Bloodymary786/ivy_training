package com.demo;
import java.util.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dog dog=new Dog();
		dog.setDogName("stonish");
		
		Person person=new Person();
		person.setDog(dog);
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(12, "raj", 69));
		employees.add(new Employee(2, "amit", 59));
		employees.add(new Employee(192, "kapil", 64));
		
		request.setAttribute("employees", employees);
		request.setAttribute("person", person);
		
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
	}


}
