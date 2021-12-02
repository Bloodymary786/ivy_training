package com.demo.config.mutilefile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans2.xml");
		
		Bar bar=(Bar) ctx.getBean("bar");
		Foo foo=(Foo) ctx.getBean("foo");
		System.out.println(bar);
		System.out.println(foo);
	}
}
