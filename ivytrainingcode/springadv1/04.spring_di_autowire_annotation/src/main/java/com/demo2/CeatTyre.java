package com.demo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "ceat")
public class CeatTyre implements Tyre {

	@Override
	public void rotate() {
		System.out.println("car work with ceat tyre...");
	}

}
