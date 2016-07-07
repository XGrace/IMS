package com.ims.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ims.domain.Product;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createNewProduct(Product product)
	{
		sessionFactory.getCurrentSession().save(product);
	}
	
	@Override 
	public void removeProductById(Long id)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from Product where productId = :id");
		
		query.setLong("id", id);
		
		query.executeUpdate();			
	}

	@Override
	public void removeProductByName(String name)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from Product where name = :name");
		
		query.setString("name", name);
		
		query.executeUpdate();
	}
	
	@Override
	public Product getProductById(Long id)
	{
		Product product = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from Product where productId = :id");
		
		query.setLong("id", id);
		
		product = (Product) query.uniqueResult();
		
		return product;		
	}
	
	@Override
	public Product getProductByName(String name)
	{
		Product product = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from Product where productName = :name");
		
		query.setString("name", name);
		
		product = (Product) query.uniqueResult();
		
		return product;
	}

	@Override
	public Product getProductByShortName(String shortName)
	{
		Product product = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from Product where shortName = :shortName");
		
		query.setString("shortName",  shortName);
		
		return product;
	}                         
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts()
	{
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}
}
