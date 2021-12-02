package com.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo1.xml");
		Shape shape=(Shape) ctx.getBean("shape");
		shape.printShape();
	}
}
