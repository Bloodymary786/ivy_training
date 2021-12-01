package com.demo.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Customer;
import com.demo.dao.CustomerDao;
import com.demo.dao.CustomerDaoImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerDao cDao = new CustomerDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("account.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//id 
		String name = request.getParameter("name");
		String dobString = request.getParameter("dob");
		//how to convert string --> date
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		Date date=null;
		try {
			 date= dateFormat.parse(dobString);
			 System.out.println(date);
		} catch (ParseException e) {
			System.out.println("invalid date");
			e.printStackTrace();
		}
		
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String accountType = request.getParameter("accountType");
		double balance =  Double.parseDouble(request.getParameter("balance"));
//		System.out.println(balance);
		Customer c1 = new Customer(name,date,address,email,accountType,balance);
		System.out.println(c1);
	
		cDao.addCustomer(c1);
		
		response.sendRedirect("success.jsp");
		
	}

}