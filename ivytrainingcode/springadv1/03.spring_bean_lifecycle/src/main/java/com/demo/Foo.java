package com.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Foo {

	private String fooVal;

	public Foo() {
		System.out.println("ctr of foo is called");
	}

	public void setFooVal(String fooVal) {
		this.fooVal = fooVal;
		System.out.println("setter of foo is called");
	}
	
	//BeanPostProcessor: aka special bean that run arund @PostConstruct
	//---------just before PostConstruct--------------
	
	@PostConstruct
	public void postCtrMethod() {
		System.out.println("@PostConstruct wala method is called");
	}

	//---------just after PostConstruct--------------
	
	public void doWork() {
		System.out.println(fooVal);
	}

	@PreDestroy
	public void preDestroyMethod() {
		System.out.println("@PreDestroy wala method is called");
	}
}
