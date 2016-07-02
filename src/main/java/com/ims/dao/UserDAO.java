package com.ims.dao;

import com.ims.domain.User;

public interface UserDAO
{
	public void createNewUser(User user);
	public User getUserByUsername(String username);
}
