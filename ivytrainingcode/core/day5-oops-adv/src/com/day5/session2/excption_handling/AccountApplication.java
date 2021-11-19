package com.day5.session2.excption_handling;

class AccountCreationExcption extends Exception {
	private static final long serialVersionUID = 1L;

	public AccountCreationExcption(String message) {
		super(message);
	}
}

class OverFundExcption extends Exception {
	private static final long serialVersionUID = 1L;

	public OverFundExcption(String message) {
		super(message);
	}
}

class NotSufficientFundExcption extends Exception {
	private static final long serialVersionUID = 1L;

	public NotSufficientFundExcption(String message) {
		super(message);
	}
}

class Account {
	private int id;
	private String name;
	private double balance;

	public double getBalance() {
		return balance;
	}
	// AccountCreationExcption: min bal should 1000/-
	public Account(int id, String name, double balance) throws AccountCreationExcption {
		if (balance < 1000) {
			throw new AccountCreationExcption("account can not be create with " + balance + " min bal should be 1000");
		}
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amout) throws OverFundExcption {
		double temp = balance + amout;
		if (temp >= 1000000) {
			throw new OverFundExcption("your total amount " + temp + " can not be deposited to the saving account");
		}
	}

	public void withdraw(double amount) throws NotSufficientFundExcption {
		double temp = balance - amount;
		if (temp < 1000) {
			throw new NotSufficientFundExcption("sorry you dont have sufficient fund to withraw " + amount
					+ " min bal after withdaw should be 1000 rs");
		}
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}

public class AccountApplication {

	public static void main(String[] args) {
		try {
		Account account=new Account(1, "Raj", 2000);
		System.out.println(account);
		account.withdraw(190);
	
		}catch(AccountCreationExcption ex) {
			System.out.println(ex.getMessage());
		}catch(NotSufficientFundExcption ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}














