package com.demo.transaction;

import java.util.*;

import com.demo.bean.Transaction;

public interface AccountTransaction {
	public void deposit(int id, double amount);
	public void withdraw(int id, double amount);
//	public List<AccountTransaction> getAllTransactions();
	public List<com.demo.bean.Transaction> getTransactionsBetweenTwoDates(Date fromDate, Date toDate);

}
