package com.demo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component(value = "mrf")
public class MrfTyre implements Tyre{

	@Override
	public void rotate() {
		System.out.println("car work with mrf tyre...");
	}

}
