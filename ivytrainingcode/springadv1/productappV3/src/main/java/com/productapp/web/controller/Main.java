package com.productapp.web.controller;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.productapp.config.ModelConfig;
import com.productapp.model.dao.Product;
import com.productapp.model.service.ProductService;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("service.xml");
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(ModelConfig.class);
		
		ProductService productService=(ProductService) ctx.getBean("ps");
		
		List<Product> list=productService.getAllProducts();
		for(Product product: list) {
			System.out.println(product);
		}
		//Product product=new Product(name, price, quantity, category, mgtDate)
		//productService.addProduct(new Product("laptop", 56000.0, 3, "Electronics", new Date()));
		//productService.addProduct(new Product("rich dad poor dad", 200.0, 3, "Books", new Date()));
		
		//Product product=productService.getById(1);
		//System.out.println(product);
		
		
	}
}
