package com.ims.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ims.domain.ClientType;

@Repository
@Transactional
public class ClientTypeDAOImpl implements ClientTypeDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createNewClientType(ClientType clientType)
	{
		sessionFactory.getCurrentSession().save(clientType);
	}

	@Override 
	public void removeClientTypeById(Long id)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from ClientType where clientTypeId = :id");
		
		query.setLong("id", id);
		
		query.executeUpdate();			
	}
	
	@Override
	public ClientType getClientTypeById(Long id)
	{
		ClientType clientType = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from ClientType where clientTypeId = :id");
		
		query.setLong("id", id);
		
		clientType = (ClientType) query.uniqueResult();
		
		return clientType;		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ClientType> getAllClientTypes()
	{
		return sessionFactory.getCurrentSession().createQuery("from ClientType").list();
	}
}
