package com.bankapp.dao.customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDoubts {

	public static void main(String[] args) throws ParseException {
		//how to convert a util date to sql date
		
		String dateStr="11/11/2011";
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		
		//java.util date
		Date date=dateFormat.parse(dateStr);
		
		//how to convert util date => sql date
		System.out.println(date.getTime());
		java.sql.Date date2=new java.sql.Date(date.getTime());
		System.out.println(date2);
		
	}
}
