package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService( name = "calapp", serviceName = "calservice", portName = "mycalport",
targetNamespace = "https://www.ivy.global/")
public class CalculatorImpl  {


	@WebMethod(exclude = true)
	public int multiply(int a, int b) {
		return a*b;
	}
	
	@WebMethod(operationName = "addMethod")
	@WebResult(name = "addResult")
	public int sum(@WebParam(name = "a") int a, @WebParam(name = "b") int b ) {
		return a+b;
	}
}







