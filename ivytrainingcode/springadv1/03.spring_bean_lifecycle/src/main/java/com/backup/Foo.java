package com.backup;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Foo implements InitializingBean, DisposableBean {
	
	private String fooVal;
	//1
	public Foo() {
		System.out.println("ctr of foo is called");
	}
	//2
	public void setFooVal(String fooVal) {
		this.fooVal = fooVal;
		System.out.println("setter of foo is called");
	}
	//-------life cycle method should not take any parameter and return any value (retrun type must be void)------------
	//4
	public void fooInit() {
		System.out.println("foo init method is called...");
	}
	//5 ....
	public void doWork() {
		System.out.println(fooVal);
	}
	
	//7
	//-------------------
	public void fooDestroy() {
		System.out.println("foo destroy method is called...");
	}
	//3
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet of InitializingBean is called");
	}
	//6
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy of DisposableBean is called");
	}
	
}
