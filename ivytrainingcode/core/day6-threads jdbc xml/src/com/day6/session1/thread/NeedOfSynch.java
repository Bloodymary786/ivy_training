package com.day6.session1.thread;
//printer ex

class Printer{
	//race condition : locking
	//synchronized method vs block
	private Object lock =new Object();
	
	public void print(String letter) {
		synchronized (lock) {
			System.out.print("[");
			try {
				Thread.sleep(1000);// 1000ms =1sec
			}catch(InterruptedException ex) {}
			System.out.println(letter + "]");
		}
	}
	
	
//	public synchronized void print(String letter) {
//		System.out.println("/////");
//		System.out.println("*********");
//		
//		System.out.print("[");
//		try {
//			Thread.sleep(1000);// 1000ms =1sec
//		}catch(InterruptedException ex) {}
//		System.out.println(letter + "]");
//		
//		System.out.println("/////");
//		System.out.println("*********");
	
}
class Client implements Runnable{
	private Printer printer;
	private String letter;
	private Thread thread;
	
	public Client(Printer printer, String letter) {
		this.printer=printer;
		this.letter=letter;
		this.thread=new Thread(this);
		this.thread.start();
	}
	@Override
	public void run() {
		printer.print(letter);
	}
	
}
public class NeedOfSynch {

	public static void main(String[] args) {
		Printer printer=new Printer();
		Client client1=new Client(printer, "i love java");
		Client client2=new Client(printer, "i love physics");
		Client client3=new Client(printer, "i am traveling to south of India");
		
		
	}
}
