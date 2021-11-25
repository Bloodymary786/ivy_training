package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component(value = "car")
public class Car {
	@Value(value = "i10")
	private String brand;
	
	@Autowired
	private Tyre tyre;

	public Car(String brand, Tyre tyre) {
		this.brand = brand;
		this.tyre = tyre;
	}

	public Car() {
		System.out.println("ctr of car");
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
