package com.empapp.persistance.user;

public class UserNotFoundException  extends RuntimeException {
	public UserNotFoundException(String message) {
		super(message);
	}
}
