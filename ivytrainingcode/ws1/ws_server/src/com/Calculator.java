package com;

import javax.jws.WebMethod;
import javax.jws.WebService;
//Code -->wsdl	:bottom up approach=> code first approach => easy but not the best*
@WebService
public class Calculator {
	@WebMethod
	public int sum(int a, int b) {
		return a+b;
	}
}
