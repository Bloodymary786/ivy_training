package com.demo;

public class NeedOfSpring {

	public static void main(String[] args) {
		
		//Car ----------> Tyre, push model vs pull model
		
		Tyre tyre=new CeatTyre();
		
		Car car=new Car();
		car.setBrand("i10");
		car.setTyre(tyre);
		car.move();
	}
}
