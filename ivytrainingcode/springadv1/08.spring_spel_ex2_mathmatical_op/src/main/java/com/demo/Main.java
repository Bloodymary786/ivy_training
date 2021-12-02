package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
		Paremeter paremeter=(Paremeter) ctx.getBean("peri");
		System.out.println(paremeter);
	}
}
