package com.ims.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ims.domain.Client;

@Repository
@Transactional
public class ClientDAOImpl implements ClientDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createNewClient(Client client)
	{
		sessionFactory.getCurrentSession().save(client);
	}

	@Override 
	public void removeClientById(Long id)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from Client where clientId = :id");
		
		query.setLong("id", id);
		
		query.executeUpdate();			
	}
	
	@Override
	public void removeClientByName(String name)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from Client where name = :name");
		
		query.setString("name", name);
		
		query.executeUpdate();
	}
	
	@Override
	public Client getClientById(Long id)
	{
		Client client = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from Client where clientId = :id");
		
		query.setLong("id", id);
		
		client = (Client) query.uniqueResult();
		
		return client;		
	}
	
	@Override
	public Client getClientByName(String name)
	{
		Client client = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from Client where name = :name");
		
		query.setString("name", name);
		
		client = (Client) query.uniqueResult();
		
		return client;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> getAllClients()
	{
		return sessionFactory.getCurrentSession().createQuery("from Client").list();
	}
}
