package com.day5.session2.interface_demo;
interface Jumpable{
	void jump();
}
 class Monkey implements Jumpable {
	public void jump() {
		System.out.println("jump of a monkey");
	}

	void climpOnTree() {
	}
}

class Kid  implements Jumpable {
	public void jump() {
		System.out.println("jump of a kid");
	}
	void takeOnlineClass() {
	}

	void playOnGround() {

	}
}

public class InterfaceBreakHierarchy {

	public static void main(String[] args) {

	}
}
