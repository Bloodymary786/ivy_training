package com.demo.dao;

import com.demo.bean.User;

public interface UserDao {
	public User getByUserNameAndPassword(String userName, String password);
	public void addUser(User user);
	 
}