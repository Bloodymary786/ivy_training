package com.app.service;

import com.app.persistence.User;

public interface UserService
{
	
	public User getByNameAndPassword(String name,String password);
	public void addUser(User user);
	

}
