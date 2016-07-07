package com.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.ClientTypeDAO;
import com.ims.domain.ClientType;

@Service
public class ClientTypeServiceImpl implements ClientTypeService
{
	@Autowired
	private ClientTypeDAO clientTypeDAOImpl;
	
	@Override
	public void addClientType(ClientType clientType)
	{
		clientTypeDAOImpl.createNewClientType(clientType);
	}
	
	@Override
	public void removeClientTypeById(Long id)
	{
		clientTypeDAOImpl.removeClientTypeById(id);
	}
	
	@Override
	public ClientType getClientTypeById(Long id)
	{
		return clientTypeDAOImpl.getClientTypeById(id);
	}
	
	@Override
	public List<ClientType> getAllClientTypes()
	{
		return clientTypeDAOImpl.getAllClientTypes();
	}
}
