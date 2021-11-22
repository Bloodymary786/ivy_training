package com.day6.session1.thread;
//using lambda expression (java 8 freature)

public class CreatingThread4 {

	public static void main(String[] args) {
		Runnable runnable=()-> System.out.println("job of the threads...");
		Thread thread=new Thread(runnable);
		thread.start();
	}
}
