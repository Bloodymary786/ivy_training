package com.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo4.xml");
		
		School school= (School) ctx.getBean("sch");
		
		school.printSchoolDetails();
		
	}
}
