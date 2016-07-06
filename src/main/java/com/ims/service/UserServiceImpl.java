package com.ims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.UserDAO;
import com.ims.dao.UserDAOImpl;
import com.ims.domain.User;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDAO userDAOImpl;
	
	public boolean registerUser(User user)
	{
		boolean doesNotExist = true;
		
		User foundUser = userDAOImpl.getUserByUsername(user.getUsername());
		
		if (foundUser == null)
			userDAOImpl.createNewUser(user);
		else
			doesNotExist = false;

		return doesNotExist;
	}
	
	public User authenticateUser(User user)
	{
		User userFromDb = userDAOImpl.getUserByUsername(user.getUsername());
		
		if (userFromDb != null && user.getPassword().equals(user))
		{
			user = userFromDb;
			user.setAuthenticated(true);
		}
		
		return user;
	}
}
