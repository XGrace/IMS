package com.ims.service;

import com.ims.dao.UserDAOImpl;
import com.ims.domain.User;

public class UserServiceImpl
{
	private UserDAOImpl userDAOImpl;
	
	public void setUserDAOImpl(UserDAOImpl userDAOImpl)
	{
		this.userDAOImpl = userDAOImpl;
	}
	
	public void createNewUser(User user)
	{
		userDAOImpl.createNewUser(user);
	}
	
	public User getUserByUsername(String username)
	{
		return userDAOImpl.getUserByUsername(username);
	}
}
