package com.day6.session1.thread;

public class DeadLockDemo {
	//Thread dump analysis : study of dead lock in our program?
	public static void main(String[] args) {
		final Object r1 = "bat";
		final Object r2 = "ball";

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("thread t1 get lock on r1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}

					synchronized (r2) {
						System.out.println("thread t1 get lock on r2");
					}
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("thread t2 get lock on r1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}

					synchronized (r2) {
						System.out.println("thread t2 get lock on r2");
					}
				}
			}
		});
		
		thread1.start();
		thread2.start();
	}
}
