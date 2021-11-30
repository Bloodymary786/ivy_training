package com.bankapp.web.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bankapp.dao.customer.Customer;
import com.bankapp.dao.customer.CustomerDao;
import com.bankapp.dao.customer.CustomerDaoImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CustomerDao customerDao=new CustomerDaoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("account.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//id 
		String name = request.getParameter("name");
		String dobString = request.getParameter("dob");
		String balanceString = request.getParameter("balance");
		double balance= Double.parseDouble(balanceString);
		//how to convert string --> date
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		Date dob=null;
		try {
			 dob= dateFormat.parse(dobString);
		} catch (ParseException e) {
			System.out.println("invalid date");
			e.printStackTrace();
		}
		
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String accountType = request.getParameter("accountType");
		
		Customer customer=new Customer(name, balance, dob, address, email, accountType);
		
		customerDao.addCustomer(customer);
		
		response.sendRedirect("success.jsp");
		
	}

}
