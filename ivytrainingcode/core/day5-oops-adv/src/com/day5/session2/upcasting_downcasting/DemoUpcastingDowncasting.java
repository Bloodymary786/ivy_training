package com.day5.session2.upcasting_downcasting;

class A {
	void show() {
		System.out.println("show of A");
	}
}

class B extends A {
	void show() {
		System.out.println("show of B");
	}
	void extraShow() {
		System.out.println("i am having extra method .. i am B");
	}
}

class C extends A {
	void show() {
		System.out.println("show of c");
	}
}

public class DemoUpcastingDowncasting {

	public static void main(String[] args) {
//		B b=new A();
//		b.extraShow();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// upcasting	:)
		A a1 = new B();
		A a2 = new C();

		//downcasting
		B b1=(B) a1;
		b1.show();
		
		//remember on thing downcasting may fail
		if(a2 instanceof B) {
			B b2=(B) a2;
			b2.show();
		}else
			System.out.println("we can not typecast");
		
		
		
	}
}









