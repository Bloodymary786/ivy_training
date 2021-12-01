package com.demo.controller;

 
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

import com.demo.bean.Transaction;
import com.demo.transaction.AccountTransaction;
import com.demo.transaction.AccountTransactionImpl;

 
 
@WebServlet("/statement.do")
public class StatementController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountTransaction accountTransaction=new AccountTransactionImpl();
     
    public StatementController() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("statement.jsp").forward(request,response);
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String start = request.getParameter("sDate");
		String end = request.getParameter("eDate");
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		Date date1=null;
		Date date2=null;
		try {
			 date1= dateFormat.parse(start);
			 date2= dateFormat.parse(end);
//			 System.out.println(date);
		} catch (ParseException e) {
			System.out.println("invalid date");
			e.printStackTrace();
		}
		java.sql.Date startDate = new java.sql.Date(date1.getTime());
		java.sql.Date endDate = new java.sql.Date(date2.getTime());
		
		List<Transaction> list = accountTransaction.getTransactionsBetweenTwoDates(date1, date2);
		 
		
	}

}
