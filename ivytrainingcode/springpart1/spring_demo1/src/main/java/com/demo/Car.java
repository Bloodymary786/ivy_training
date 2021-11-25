package com.demo;

public class Car {
	private String brand;
	private Tyre tyre;

	public Car(String brand, Tyre tyre) {
		this.brand = brand;
		this.tyre = tyre;
	}

	public Car() {
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public String getBrand() {
		return brand;
	}

	public Tyre getTyre() {
		return tyre;
	}

	// public Car(String brand, Tyre tyre) {
//		this.brand=brand;
//		this.tyre=tyre;
//	}
	public void move() {
		System.out.println(brand);
		tyre.rotate();
	}
}
