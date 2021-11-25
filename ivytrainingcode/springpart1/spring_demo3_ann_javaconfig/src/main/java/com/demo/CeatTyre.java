package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component	
public class CeatTyre implements Tyre {

	public CeatTyre() {
		System.out.println("ctr of ceat...");
	}

	@Override
	public void rotate() {
		System.out.println("ceat tyre is working...");
	}
}
