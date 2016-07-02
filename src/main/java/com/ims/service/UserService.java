package com.ims.service;

import com.ims.domain.User;

public interface UserService
{
	public void createNewUser(User user);
	public User getUserByUsername(String username);
}
