package com.ims.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ims.domain.Address;

@Repository
@Transactional
public class AddressDAOImpl implements AddressDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createNewAddress(Address address)
	{
		sessionFactory.getCurrentSession().save(address);
	}
	
	@Override
	public void removeAddressById(Long id)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from Address where addressId = :id");
		
		query.setLong("id", id);
		
		query.executeUpdate();		
	}
	
	@Override
	public void removeAddressByAddress(String address)
	{
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from Address where streetAddress1 = :address");
		
		query.setString("address", address);
		
		query.executeUpdate();
	}
	
	@Override
	public Address getAddressById(Long id)
	{
		Address address = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from Address where addressId = :id");
		
		query.setLong("id", id);
		
		address = (Address) query.uniqueResult();
		
		return address;
	}
	
	@Override
	public Address getAddressByAddress(String address)
	{
		Address add = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from Address where streetAddress1 = :address");
		
		query.setString("address", address);
		
		add = (Address) query.uniqueResult();
		
		return add;		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Address> getAllAddresses()
	{
		return sessionFactory.getCurrentSession().createQuery("from Address").list();		
	}
}
