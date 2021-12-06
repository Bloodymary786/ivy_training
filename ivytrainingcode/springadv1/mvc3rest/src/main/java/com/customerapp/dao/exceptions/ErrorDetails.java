package com.customerapp.dao.exceptions;

import java.util.Date;

public class ErrorDetails {
	private String errorMessage;
	private Date date;
	private String contact;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public ErrorDetails(String errorMessage, Date date, String contact) {
		this.errorMessage = errorMessage;
		this.date = date;
		this.contact = contact;
	}
	public ErrorDetails() {}
	
	
}
