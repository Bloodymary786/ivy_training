package com.empapp.persistance.user;

public interface UserDao {
	public User getByUserNameAndPassword(String userName, String password);
	public void addUser(User user);
}
