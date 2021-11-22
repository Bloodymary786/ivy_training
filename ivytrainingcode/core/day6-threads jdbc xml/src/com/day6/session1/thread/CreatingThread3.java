package com.day6.session1.thread;
//by using anonymous inner class

interface Foo{
	void foo();
}
//class A{
//	class B{
//		void foo() {
//			System.out.println("foo method of class B");
//		}
//	}
//}
public class CreatingThread3 {

	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("job of thread....");
			}
		};
		
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("job of thread....");
			}
		});
		thread.start();
//		Foo foo=new Foo() {
//			
//			@Override
//			public void foo() {
//				System.out.println("foo metod is overriden");
//			}
//		};
//		
//	Foo foo2=new Foo() {
//			
//			@Override
//			public void foo() {
//				System.out.println("foo metod is overriden 2");
//			}
//		};
	}
}
