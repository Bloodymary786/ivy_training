package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MrfTyre implements Tyre {
	public MrfTyre() {
		System.out.println("ctr of Mrf...");
	}

	@Override
	public void rotate() {
		System.out.println("mrf tyre is working...");
	}
}
