package com.demo;

import javax.xml.ws.Endpoint;

public class DemoMain {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8091/calapp/ws", new CalculatorImpl());
		System.out.println("web service is working...");
	}
}
