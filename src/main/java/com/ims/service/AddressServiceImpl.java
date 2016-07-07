package com.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.AddressDAO;
import com.ims.domain.Address;

@Service
public class AddressServiceImpl implements AddressService
{
	@Autowired
	private AddressDAO addressDAOImpl;
	
	@Override
	public void addAddress(Address address)
	{
		addressDAOImpl.createNewAddress(address);
	}
	
	@Override
	public void removeAddressById(Long id)
	{
		addressDAOImpl.removeAddressById(id);
	}
	
	@Override
	public void removeAddressByAddress(String address)
	{
		addressDAOImpl.removeAddressByAddress(address);		
	}
	
	@Override
	public Address getAddressById(Long id)
	{
		return addressDAOImpl.getAddressById(id);
	}
	
	@Override
	public Address getAddressByAddress(String address)
	{
		return addressDAOImpl.getAddressByAddress(address);
	}
	
	@Override
	public List<Address> getAllAddresses()
	{
		return addressDAOImpl.getAllAddresses();
	}
}
