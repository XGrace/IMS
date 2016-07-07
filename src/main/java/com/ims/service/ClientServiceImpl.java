package com.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.ClientDAO;
import com.ims.domain.Client;

@Service
public class ClientServiceImpl implements ClientService
{
	@Autowired
	private ClientDAO clientDAOImpl;
	
	@Override
	public void addClient(Client client)
	{
		clientDAOImpl.createNewClient(client);
	}
	
	@Override
	public void removeClientByName(String name)
	{
		clientDAOImpl.removeClientByName(name);
	}
	
	@Override
	public Client getClientByName(String name)
	{
		return clientDAOImpl.getClientByName(name);
	}
	
	@Override
	public List<Client> getAllClients()
	{
		return clientDAOImpl.getAllClients();
	}
}
