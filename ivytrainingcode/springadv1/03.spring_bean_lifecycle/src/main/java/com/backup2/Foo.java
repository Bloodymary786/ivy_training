package com.backup2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Foo  {
	
	private String fooVal;
	
	public Foo() {
		System.out.println("ctr of foo is called");
	}

	public void setFooVal(String fooVal) {
		this.fooVal = fooVal;
		System.out.println("setter of foo is called");
	}
	//Spring dont care about @PostConstruct and @PreDestroy 
	//until u register a special bean "CommonAnnationBeanPostProcessor" or u have to go for annotation configration
	@PostConstruct
	public void postCtrMethod() {
		System.out.println("@PostConstruct wala method is called");
	}
	public void fooInit() {
		System.out.println("foo init method is called...");
	}

	public void doWork() {
		System.out.println(fooVal);
	}

	public void fooDestroy() {
		System.out.println("foo destroy method is called...");
	}
	
	@PreDestroy
	public void preDestroyMethod() {
		System.out.println("@PreDestroy wala method is called");
	}
}
