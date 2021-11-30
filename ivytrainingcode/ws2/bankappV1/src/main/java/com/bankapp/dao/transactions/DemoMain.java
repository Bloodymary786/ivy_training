package com.bankapp.dao.transactions;

public class DemoMain {

	public static void main(String[] args) {
		AccountTransaction accountTransaction=new AccountTransactionImpl();
		accountTransaction.withdraw(2, 150);
	}
}
