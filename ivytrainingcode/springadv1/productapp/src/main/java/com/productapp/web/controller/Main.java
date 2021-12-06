package com.productapp.web.controller;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.productapp.dao.Product;
import com.productapp.service.ProductService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("service.xml");
		
		ProductService productService=(ProductService) ctx.getBean("ps");
		//Product product=new Product(name, price, quantity, category, mgtDate)
		//productService.addProduct(new Product("laptop", 56000.0, 3, "Electronics", new Date()));
		//productService.addProduct(new Product("rich dad poor dad", 200.0, 3, "Books", new Date()));
		
		//Product product=productService.getById(1);
		//System.out.println(product);
		
		
	}
}
