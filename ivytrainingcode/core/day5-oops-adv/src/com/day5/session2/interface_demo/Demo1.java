package com.day5.session2.interface_demo;
interface Foo{
	int i=10;
	void foo();//by dafult public and abs
}
interface Bar{
	int i=20;
	void foo();
}

class Zoom implements Foo, Bar{
	@Override
	public void foo() {
		System.out.println("foo method is imp..."+ Bar.i);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		
	}
}
