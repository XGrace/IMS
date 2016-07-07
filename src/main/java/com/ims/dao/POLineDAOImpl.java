package com.ims.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ims.domain.POLine;

@Repository
@Transactional
public class POLineDAOImpl implements POLineDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createNewPOLine(POLine poLine)
	{
		sessionFactory.getCurrentSession().save(poLine);
	}
	
	@Override
	public void removePOLineByLineNumber(Long lineNumber)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from POLine where lineNumber = :number");
		
		query.setLong("number", lineNumber);
		
		query.executeUpdate();	
	}
		
	@Override
	public POLine getPOLineByLineNumber(Long lineNumber)
	{
		POLine poLine = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from POLine where lineNumber = :number");
		
		query.setLong("number", lineNumber);
		
		poLine = (POLine) query.uniqueResult();
		
		return poLine;			
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<POLine> getAllPOLines()
	{
		return sessionFactory.getCurrentSession().createQuery("from POLine").list();
	}
}
