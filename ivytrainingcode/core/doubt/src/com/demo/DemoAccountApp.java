package com.demo;

import java.util.UUID;

abstract class Account {
	private String id;
	private String name;
	private double balance;
	private static int counter = 0;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.id = "acc "+  ++counter;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public abstract void withdraw(double amount);

	public abstract void deposit(double amount);

}

class SBAccount extends Account {

	private static final int INTREST_RATE = 4;

	public SBAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public void withdraw(double amount) {

	}

	@Override
	public void deposit(double amount) {

	}

}

class CurrentAccount extends Account {

	private static final int MIN_BALANCE = 1000;

	public CurrentAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public void withdraw(double amount) {

	}

	@Override
	public void deposit(double amount) {

	}

}

public class DemoAccountApp {

	public static void main(String[] args) {
		Account account = new CurrentAccount("raj", 6700);
		System.out.println(account);

	}
}
