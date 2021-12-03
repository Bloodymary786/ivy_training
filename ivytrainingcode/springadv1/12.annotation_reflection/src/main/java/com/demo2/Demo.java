package com.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {

	private static Logger logger=LoggerFactory.getLogger(Demo.class);
	
	public static void main(String[] args) {
		
		//log4j
		logger.info("hello world logging");
		logger.info("another log message");
		String data="123A";
		try {
			Integer va=Integer.parseInt(data);
		}catch(NumberFormatException e) {
			logger.error("number formate error has occured");
		}
	}
}
