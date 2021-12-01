package com.demo;

public class Car {
	private String passanger;
	private Tyre  tyre;

	public Car() {
		System.out.println("def ctr is called");
	}

	public Car(String passanger, Tyre tyre) {
		
		this.passanger = passanger;
		this.tyre = tyre;
		System.out.println("para ctr is called");
	}

	public void setPassanger(String passanger) {
		this.passanger = passanger;
		System.out.println("setPassanger is called");
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
		System.out.println("setTyre is called");
	}
	
	public void run() {
		System.out.println("passanger name: "+ passanger);
		tyre.rotate();
	}
	
}
