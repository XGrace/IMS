package com.ims.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ims.domain.User;

public class UserDAOImpl implements UserDAO
{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
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
