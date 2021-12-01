package com.demo;

public class CustomerData {
	private String name;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public CustomerData() {}
	public CustomerData(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CustomerData [name=" + name + ", phone=" + phone + "]";
	}
	
	

}
