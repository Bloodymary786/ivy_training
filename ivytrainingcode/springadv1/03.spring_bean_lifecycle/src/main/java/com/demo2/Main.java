package com.demo2;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//why i teach u beanFactoryPP?
		//it is so useful in every day spring framework programming
		//PropertyPlaceholderConfigurer: BeanFacotryPP, to read the properity file
		
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("account.xml");
		
		Account account=(Account) ctx.getBean("acc");
		System.out.println(account);
	}
}
