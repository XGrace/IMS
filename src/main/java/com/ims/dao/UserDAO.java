package com.ims.dao;

import java.util.List;

import com.ims.domain.User;

public interface UserDAO
{
	public void createNewUser(User user);
	
	public void removeUserById(Long id);
	public void removeUserByUsername(String username);
	
	public User getUserById(Long id);
	public User getUserByUsername(String username);
	
	public List<User> getAllUsers();
}
