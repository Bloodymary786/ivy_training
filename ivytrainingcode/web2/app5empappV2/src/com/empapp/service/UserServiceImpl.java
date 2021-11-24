package com.empapp.service;

import com.empapp.persistance.user.User;
import com.empapp.persistance.user.UserDao;
import com.empapp.persistance.user.UserDaoJdbcImpl;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao=new UserDaoJdbcImpl();
	}
	@Override
	public User getByUserNameAndPassword(String userName, String password) {
		return userDao.getByUserNameAndPassword(userName, password);
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

}
