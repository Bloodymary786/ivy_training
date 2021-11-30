package com.bankapp.web.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bankapp.dao.transactions.AccountTransaction;
import com.bankapp.dao.transactions.AccountTransactionImpl;
import com.bankapp.dao.transactions.Transaction;

@WebServlet("/statement.do")
public class StatementController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountTransaction accountTx = new AccountTransactionImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setAttribute("transactions", accountTx.getAllTransactions());
		request.getRequestDispatcher("statement.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fromDateString = request.getParameter("fromDate");
		String toDateString = request.getParameter("toDate");

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date fromDate = null;
		Date toDate = null;

		try {
			fromDate = dateFormat.parse(fromDateString);
			toDate = dateFormat.parse(toDateString);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		List<Transaction> transactions = 
				accountTx.getTransactionsBetweenTwoDates(fromDate, toDate);
		
		request.setAttribute("transactions",transactions);
		request.getRequestDispatcher("statement.jsp").forward(request, response);
	}
}
