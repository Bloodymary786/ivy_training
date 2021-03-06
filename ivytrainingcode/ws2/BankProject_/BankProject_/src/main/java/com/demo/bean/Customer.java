package com.demo.bean;

import java.util.Date;

public class Customer {
	private int id;
	private String name;
	private Date dob;
	private String  address;
	private String  email;
	private String  accountType;
	private double balance ;
	public Customer(String name, Date dob, String address, String email, String accountType, double balance) {
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.accountType = accountType;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Customer(String name, Date dob, String address, String email, String accountType) {
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.accountType = accountType;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", email=" + email
				+ ", accountType=" + accountType + ", balance=" + balance + "]";
	}
	public Customer() {}
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}