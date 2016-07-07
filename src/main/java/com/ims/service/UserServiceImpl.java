package com.ims.service;

import java.util.List;

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
	public void removeUserById(Long id)
	{
		userDAOImpl.removeUserById(id);
	}
	
	@Override
	public void removeUserByUsername(String username)
	{
		userDAOImpl.removeUserByUsername(username);
	}
	
	@Override
	public User getUserById(Long id)
	{
		return userDAOImpl.getUserById(id);
	}
	
	@Override
	public User getUserByUsername(String username)
	{
		return userDAOImpl.getUserByUsername(username);
	}
	
	@Override
	public List<User> getAllUsers()
	{
		return userDAOImpl.getAllUsers();
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
