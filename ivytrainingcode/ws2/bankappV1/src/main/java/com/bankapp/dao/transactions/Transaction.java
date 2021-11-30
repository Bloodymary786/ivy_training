package com.bankapp.dao.transactions;

import java.util.Date;

public class Transaction {
	private int tid;
	private Date txdate;
	private int cid;
	private double amount;
	private String optype;

	public Transaction() {}

	public Transaction(Date txdate, int cid, double amount, String optype) {
		this.txdate = txdate;
		this.cid = cid;
		this.amount = amount;
		this.optype = optype;
	}

	public int getTid() {
		return tid;
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

	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", txdate=" + txdate + ", cid=" + cid + ", amount=" + amount + ", optype="
				+ optype + "]";
	}

}
