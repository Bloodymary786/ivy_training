package com.demo.bean;

import java.util.Date;

public class Transaction {
	int tid;
	Date txdate;
	int cid;
	double amount;
	String optype;
	double availBalance;
	
	public Transaction(int tid, Date txdate, int cid, double amount, String optype, double availBalance) {
		this.tid = tid;
		this.txdate = txdate;
		this.cid = cid;
		this.amount = amount;
		this.optype = optype;
		this.availBalance = availBalance;
	}

	public int getTid() {
		return tid;
	}

	public Transaction(Date txdate, double amount, String optype, double availBalance) {
		super();
		this.txdate = txdate;
		this.amount = amount;
		this.optype = optype;
		this.availBalance = availBalance;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public Date getTxdate() {
		return txdate;
	}

	public void setTxdate(Date txdate) {
		this.txdate = txdate;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getOptype() {
		return optype;
	}

	public void setOptype(String optype) {
		this.optype = optype;
	}

	public double getAvailBalance() {
		return availBalance;
	}

	public void setAvailBalance(double availBalance) {
		this.availBalance = availBalance;
	}

	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", txdate=" + txdate + ", cid=" + cid + ", amount=" + amount + ", optype="
				+ optype + ", availBalance=" + availBalance + "]";
	}

	
	
}
