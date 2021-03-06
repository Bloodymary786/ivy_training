package com.demo.inh.joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="curr_account")
public class CurrentAccount extends Account {
	@Column(nullable = false)
	private double overdraft;

	public CurrentAccount(String accountHolderName, double balance, double overdraft) {
		super(accountHolderName, balance);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public CurrentAccount() {}

	@Override
	public String toString() {
		return   super.toString()+": "+ overdraft;
	}


	
}