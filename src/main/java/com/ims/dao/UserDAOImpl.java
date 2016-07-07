package com.ims.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ims.domain.User;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createNewUser(User user)
	{
		sessionFactory.getCurrentSession().save(user);
	}
	
	@Override
	public User getUserByUsername(String username)
	{
		User user = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from User where username = :username");
		
		query.setString("username", username);
		
		user = (User) query.uniqueResult();
		
		return user;
	}
}
