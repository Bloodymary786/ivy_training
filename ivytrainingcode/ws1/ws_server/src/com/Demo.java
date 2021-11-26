package com;

import javax.xml.ws.Endpoint;

public class Demo {

	public static void main(String[] args) {
		//i need to publish ws on some ip/port 
		Endpoint.publish("http://localhost:8050/ws", new Calculator());
		System.out.println("ws is deployed");
	}
}
