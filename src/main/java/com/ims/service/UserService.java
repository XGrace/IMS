package com.ims.service;

import com.ims.domain.User;

public interface UserService
{
	public boolean registerUser(User user);
	public User authenticateUser(User user);
}
