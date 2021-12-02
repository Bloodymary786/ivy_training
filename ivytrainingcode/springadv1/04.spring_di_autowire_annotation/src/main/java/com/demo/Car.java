package com.demo;

public class Car {
	private String passanger;
	private Tyre  tyre;

	public Car() {
	}

	public Car(String passanger, Tyre tyre) {
		
		this.passanger = passanger;
		this.tyre = tyre;
	}

	public void setPassanger(String passanger) {
		this.passanger = passanger;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	public void run() {
		System.out.println("passanger name: "+ passanger);
		tyre.rotate();
	}
	
}
