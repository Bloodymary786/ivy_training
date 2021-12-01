package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.transaction.AccountTransaction;
import com.demo.transaction.AccountTransactionImpl;

 

@WebServlet("/transaction.do")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AccountTransaction accountTransaction=new AccountTransactionImpl();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("transaction.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int aid = Integer.parseInt(request.getParameter("aid"));
		double amount = Double.parseDouble(request.getParameter("amount"));
		String action=request.getParameter("action");
		System.out.println("--------------------------------------");
		System.out.println(action);
		System.out.println("--------------------------------------");
		if("deposit".equalsIgnoreCase(action)) {
		accountTransaction.deposit(aid, amount);
		}else {
			accountTransaction.withdraw(aid, amount);
		}
		response.sendRedirect("success.jsp");
	}

}