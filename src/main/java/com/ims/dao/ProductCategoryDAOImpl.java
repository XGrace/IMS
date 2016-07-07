package com.ims.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ims.domain.ProductCategory;

@Repository
@Transactional
public class ProductCategoryDAOImpl implements ProductCategoryDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createNewProductCategory(ProductCategory productCategory)
	{
		sessionFactory.getCurrentSession().save(productCategory);
	}
	
	@Override
	public void removeProductCategoryById(Long id)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from ProductCategory where categoryId = :id");
		
		query.setLong("id", id);
		
		query.executeUpdate();		
	}
	
	@Override
	public ProductCategory getProductCategoryById(Long id)
	{
		ProductCategory productCategory = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from ProductCategory where categoryId = :id");
		
		query.setLong("id", id);
		
		productCategory = (ProductCategory) query.uniqueResult();
		
		return productCategory;			
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductCategory> getAllProductCategorys()
	{
		return sessionFactory.getCurrentSession().createQuery("from ProductCategory").list();		
	}
}
