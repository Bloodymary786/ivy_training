package com.demo;

public class Car {
	private String ownerName;
	private Engine engine;
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void travel() {
		System.out.println("passanger name : "+ ownerName);
		engine.move();
	}
}
