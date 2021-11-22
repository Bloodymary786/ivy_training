package com.day6.session1.thread;
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		System.out.println("the job of thread "+ Thread.currentThread().getName());
	}
}
public class CreatingThread2 {

	public static void main(String[] args) {
		
		MyThread myThread=new MyThread("A");
		myThread.start();
	}
}
