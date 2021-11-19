package com.day5.session1.polymorphism;
//C function overloading  is not supported 

//Ambiguty in function overloading

class Calculator{
	public long add(int a, long b) {
		System.out.println("public int add(int a, int b)");
		return a+b;
	}
	public long add(long a, int b) {
		System.out.println("public int add(int a, int b)");
		return a+b;
	}

}
public class DemoFunctionOverloading {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		
		long result=calculator.add(2, 3L);
		System.out.println(result);
		
	}
}




//public int add(int a, int b, int c) {
//	System.out.println("public int add(int a, int b, int c)");
//	return a+b+c;
//}