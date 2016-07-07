package com.ims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.UserDAO;
import com.ims.domain.User;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDAO userDAOImpl;
	
	@Override
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
	
	@Override
	public User authenticateUser(User user)
	{
		User userFromDb = userDAOImpl.getUserByUsername(user.getUsername());
		
		if (userFromDb != null && userFromDb.getPassword().equals(user.getPassword()))
		{
			user = userFromDb;
			user.setAuthenticated(true);
			return user;
		}
		else
			return null;
	}
}
