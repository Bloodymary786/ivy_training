package com.bankapp.dao.transactions;
import java.util.*;
public interface AccountTransaction {
	public void deposit(int id, double amount);
	public void withdraw(int id, double amount);
	public List<Transaction>getAllTransactions();
	public List<Transaction>getTransactionsBetweenTwoDates(Date fromDate, Date toDate);
}
