package com;

public class DemoClient {

	public static void main(String[] args) {
		CalculatorService calculatorService=new CalculatorService();
		//we get a contract to call ws
		Calculator calculator=calculatorService.getCalculatorPort();
		System.out.println(calculator.sum(2, 3));
	}
}
