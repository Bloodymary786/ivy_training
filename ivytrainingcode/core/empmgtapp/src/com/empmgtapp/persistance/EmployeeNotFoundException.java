package com.empmgtapp.persistance;

public class EmployeeNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -6425760380580853083L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
