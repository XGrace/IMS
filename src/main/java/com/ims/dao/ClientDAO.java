package com.ims.dao;

import java.util.List;

import com.ims.domain.Client;

public interface ClientDAO
{
	public void createNewClient(Client client);
	
	public void removeClientById(Long id);
	public void removeClientByName(String name);
	
	public Client getClientById(Long id);
	public Client getClientByName(String name);
	
	public List<Client> getAllClients();
}
