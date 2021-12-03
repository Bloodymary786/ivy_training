package com.demo;
import java.util.*;

//inbuild annotation
// @Override
class Foo{
	void foo() {
		System.out.println("foo method ...");
	}
	@Deprecated
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void oldApi() {
		System.out.println("old api written in 2007");
		
		List l=new ArrayList();
		l.add("raj");
		
	}
	public void newApi() {
		System.out.println("new api written in 2021");
		
		
	}
}

class Foo2 extends Foo{
	@Override
	void foo() {
		System.out.println("foo method .overriding..");
	}
}

public class DemoAnnotation {

	public static void main(String[] args) {
		//Date date=new Date(2021, 11, 21);
		
		Foo f=new Foo2();
		f.foo();
		f.newApi();
	}
}
