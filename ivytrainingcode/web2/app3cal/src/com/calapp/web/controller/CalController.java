package com.calapp.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calapp.model.Calculator;

@WebServlet("/cal")
public class CalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		//Single responsibility prin...
		
		//get the data from the user and senetized and convert the data type
		Integer num1=Integer.parseInt(request.getParameter("numberA"));
		Integer num2=Integer.parseInt(request.getParameter("numberB"));
		
		// it calculate the sum ? controller should take the help of model layer
		Integer sum=Calculator.sum(num1, num2);
		
		//display the result, this is the job of view layer
//		PrintWriter out=response.getWriter();
//		out.print("sum is : "+ sum + "<br/>");
		
		//request, session, application
		
		request.setAttribute("sum", sum); //used to pass the data from S-->jsp
		
		//used to tranfer the control from S-> jsp
		RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
		rd.forward(request, response);
		
		
	}

}







