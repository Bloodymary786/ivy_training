package com.bankapp.dao.transactions;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DemoMain {

	public static void main(String[] args) throws ParseException {
		AccountTransaction accountTransaction=new AccountTransactionImpl();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		Date date1=dateFormat.parse("24/11/2021");
		Date date2=dateFormat.parse("29/11/2021");
		
		
		List<Transaction>list=accountTransaction.getTransactionsBetweenTwoDates(date1, date2);
		for(Transaction t: list) {
			System.out.println(t);
		}
		
		System.out.println("--------------");
	}
}
