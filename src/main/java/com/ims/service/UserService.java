package com.ims.service;

import java.util.List;

import com.ims.domain.User;

public interface UserService
{
	public boolean registerUser(User user);
	
	public void removeUserById(Long id);
	public void removeUserByUsername(String username);
	
	public User getUserById(Long id);
	public User getUserByUsername(String username);
	
	public List<User> getAllUsers();
	
	public User authenticateUser(User user);
}
