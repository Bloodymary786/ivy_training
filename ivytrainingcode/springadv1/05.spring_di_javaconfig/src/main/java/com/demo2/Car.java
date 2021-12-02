package com.demo2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value = "car")	
public class Car {
	@Value(value = "raj")	
	private String passanger;
	
	@Autowired(required = true)
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
