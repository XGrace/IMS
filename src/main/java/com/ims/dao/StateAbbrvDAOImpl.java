package com.ims.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ims.domain.StateAbbrv;

@Repository
@Transactional
public class StateAbbrvDAOImpl implements StateAbbrvDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createNewStateAbbrv(StateAbbrv stateAbbrv)
	{
		sessionFactory.getCurrentSession().save(stateAbbrv);
	}
	
	@Override
	public void removeStateAbbrvById(Long id)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from StateAbbrv where abbrvId = :id");
		
		query.setLong("id", id);
		
		query.executeUpdate();		
	}
	
	@Override
	public StateAbbrv getStateAbbrvById(Long id)
	{
		StateAbbrv stateAbbrv = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from StateAbbrv where abbrvId = :id");
		
		query.setLong("id", id);
		
		stateAbbrv = (StateAbbrv) query.uniqueResult();
		
		return stateAbbrv;			
	}
	
	@Override
	public StateAbbrv getStateAbbrvByStateName(String stateName)
	{
		StateAbbrv stateAbbrv = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from StateAbbrv where stateName = :stateName");
		
		query.setString("stateName", stateName);
		
		stateAbbrv = (StateAbbrv) query.uniqueResult();
		
		return stateAbbrv;					
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<StateAbbrv> getAllStateAbbrvs()
	{
		return sessionFactory.getCurrentSession().createQuery("from StateAbbrv").list();		
	}
}
