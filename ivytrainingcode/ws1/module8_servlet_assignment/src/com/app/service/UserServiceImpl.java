package com.app.service;

import com.app.persistence.User;
import com.app.persistence.UserDao;
import com.app.persistence.UserDaoJdbcImpl;

public class UserServiceImpl implements UserService
{
	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao=new UserDaoJdbcImpl();
	}

	@Override
	public User getByNameAndPassword(String name, String password) {
		System.out.println("hgfddf");
		return userDao.getByNameAndPassword(name, password);
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
		
	}
	

}
