package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "rg")
public class RandomGen {
	@Value(value = "#{T(java.lang.Math).random()}")
	Double randomNumber;
	
	@Value(value = "#{T(java.lang.Math).PI}")
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
