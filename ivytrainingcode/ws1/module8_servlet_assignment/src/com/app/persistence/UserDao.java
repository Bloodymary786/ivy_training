package com.app.persistence;

public interface UserDao 
{
	public User getByNameAndPassword(String name,String password);
	public void addUser(User user);
	

}
