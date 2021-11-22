package com.day6.session1.thread;

//Race condition?
class MyJob implements Runnable{

	@Override
	public void run() {
		System.out.println("job is started by thread :" + Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		}catch(InterruptedException ex) {}
		System.out.println("job is end by thread :" + Thread.currentThread().getName());
	}
	
}
public class DemoThreads {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("inside main: "+ Thread.currentThread().getName());
		MyJob job=new MyJob();//job
		Thread thread1=new Thread(job,"one");//I am creating the job and provide to the worker
		Thread thread2=new Thread(job,"two");
		thread1.start();// should never call run methdod directly
		thread2.start();
		//join method is used to gurantee that main should end at last
		thread1.join();
		thread2.join();
		System.out.println("main finished.");
		//Thread
		//Runnable
	}
}
