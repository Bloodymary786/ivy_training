package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
		Magician magician=(Magician) ctx.getBean("magician");
		//System.out.println(magician.getClass());
		magician.doMagic();
		
	}
}
