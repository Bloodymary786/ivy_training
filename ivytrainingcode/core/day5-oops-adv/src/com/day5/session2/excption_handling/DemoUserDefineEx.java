package com.day5.session2.excption_handling;
/*
 * how to define user define exceptions
 * 1. create a class NegativeRadiusExcpetion and extend either RuntimeExcpetion / Exception
 * 
 * 2. use that exception (throw and throws )
 */
//NegativeRadiusExcpetion
class NegativeRadiusExcpetion extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public NegativeRadiusExcpetion(String message) {
		super(message);
	}
}
class Circle{
	private int radius;
	
	public Circle(int radius)  {
		if(radius<=0) {
			throw new NegativeRadiusExcpetion("radius "+ radius + " is not allowed");
		}
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
}
public class DemoUserDefineEx {

	public static void main(String[] args) {
		try {
			Circle circle=new Circle(-2);
			System.out.println(circle.getArea());
		
			System.out.println("dont give -ve rad");
		}catch( NegativeRadiusExcpetion ex) {
			System.out.println(ex.getMessage());
		}
	
	}
}
