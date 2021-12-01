package com.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Enitity: @Entity @Id
@Entity
@Table(name = "customer_table")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private int id;

	@Column(name = "c_name", nullable = false, length = 100)
	private String name;

	@Column(name = "c_phone", nullable = false, length = 20)
	private String phone;

	@Column(name = "c_email", nullable = false, length = 100)
	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name = "c_dob", nullable = false)
	private Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Customer() {
	}

	public Customer(String name, String phone, String email, Date dob) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", dob=" + dob + "]";
	}

	

}
