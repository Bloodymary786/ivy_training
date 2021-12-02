package com.demo;

public class RandomGen {
	Double randomNumber;
	Double pi;
	
	public Double getRandomNumber() {
		return randomNumber;
	}
	public void setRandomNumber(Double randomNumber) {
		this.randomNumber = randomNumber;
	}
	public Double getPi() {
		return pi;
	}
	public void setPi(Double pi) {
		this.pi = pi;
	}
	
	public void print() {
		System.out.println(randomNumber);
		System.out.println(pi);
	}
	
}
