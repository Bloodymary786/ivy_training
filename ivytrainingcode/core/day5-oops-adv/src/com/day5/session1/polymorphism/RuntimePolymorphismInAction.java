package com.day5.session1.polymorphism;
import java.util.Scanner;

abstract class Shape{
	abstract public void showArea();
}

class Triangle extends Shape{
	
	public void showArea() {
		System.out.println("area of T is = 0.5 * b * h");
	}
}

class Square extends Shape{
	
	public void showArea() {
		System.out.println("area of square = a*a");
	}
}

class Circle extends Shape{
	
	public void showArea() {
		System.out.println("area of Cirle= is pi r2");
	}
}
public class RuntimePolymorphismInAction {

	public static void main(String[] args) {
		
		Shape shape=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE ur choice 1.Cirlce 2.Square 3.Triangle");
		int choice=scanner.nextInt();
		if(choice==1) {
			shape=new Circle();
		}else if(choice==2) {
			shape=new Square();
		}else if(choice==3) {
			shape=new Triangle();
		}else {
			System.out.println("make correct choice");
		}
		
		if(shape!=null)
			shape.showArea();
	}
}













