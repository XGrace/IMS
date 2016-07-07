package com.ims.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ims.domain.PurchaseOrder;

@Repository
@Transactional
public class PurchaseOrderDAOImpl implements PurchaseOrderDAO
{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createNewPurchaseOrder(PurchaseOrder purchaseOrder)
	{
		sessionFactory.getCurrentSession().save(purchaseOrder);
	}
	
	@Override
	public void removePurchaseOrderByOrderNumber(Long orderNumber)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from PurchaseOrder where orderNumber = :number");
		
		query.setLong("number", orderNumber);
		
		query.executeUpdate();	
	}
	
	@Override
	public PurchaseOrder getPurchaseOrderByOrderNumber(Long orderNumber)
	{
		PurchaseOrder purchaseOrder = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from PurchaseOrder where orderNumber = :number");
		
		query.setLong("number", orderNumber);
		
		purchaseOrder = (PurchaseOrder) query.uniqueResult();
		
		return purchaseOrder;			
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PurchaseOrder> getAllPurchaseOrders()
	{
		return sessionFactory.getCurrentSession().createQuery("from PurchaseOrder").list();		
	}
}
