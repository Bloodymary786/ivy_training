package com.demo.inh.table_per_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
public class SavingAccount extends Account {
	
	@Column(nullable = false)
	private double intrestRate;

	public SavingAccount(String accountHolderName, double balance, double intrestRate) {
		super(accountHolderName, balance);
		this.intrestRate = intrestRate;
	}

	public double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}

	@Override
	public String toString() {
		return   super.toString()+": "+ intrestRate;
	}

	public SavingAccount() {}

}
