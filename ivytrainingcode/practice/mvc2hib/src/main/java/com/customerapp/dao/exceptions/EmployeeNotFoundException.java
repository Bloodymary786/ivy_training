package com.customerapp.dao.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -5016187716763047609L;

	public EmployeeNotFoundException(String message) {
		super(message);

	}

}
