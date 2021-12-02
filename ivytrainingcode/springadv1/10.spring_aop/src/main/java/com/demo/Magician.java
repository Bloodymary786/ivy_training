package com.demo;

import org.springframework.stereotype.Component;

//when magician shows the maagic then audience doing clapping
//? clapping of audience is a kind of "Cross cutting concern" for magician
@Component(value = "magician")
public class Magician {
	public void doMagic() {
		System.out.println("abra ka dabra...");
		/*
		 * if(1==1 ) { throw new RuntimeException(); }
		 */
	}
	public void getIll() {
		System.out.println("i got ill :(...");
	}
}
