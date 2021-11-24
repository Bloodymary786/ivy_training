package com.empapp.service;

import com.empapp.persistance.user.User;

public interface UserService {
	public User getByUserNameAndPassword(String userName, String password);
	public void addUser(User user);
}
