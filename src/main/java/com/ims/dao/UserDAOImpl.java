package com.ims.dao;

import java.util.List;

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
	public void removeUserById(Long id)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from User where userId = :id");
		
		query.setLong("id", id);
		
		query.executeUpdate();	
	}
	
	@Override
	public void removeUserByUsername(String username)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from User where username = :name");
		
		query.setString("name", username);
		
		query.executeUpdate();
	}
	
	@Override
	public User getUserById(Long id)
	{
		User user = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from User where userId = :id");
		
		query.setLong("id", id);
		
		user = (User) query.uniqueResult();
		
		return user;
	}
	
	@Override
	public User getUserByUsername(String username)
	{
		User user = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from User where username = :name");
		
		query.setString("name", username);
		
		user = (User) query.uniqueResult();
		
		return user;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers()
	{
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}
}
