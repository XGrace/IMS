package com.ims.service;

import java.util.List;

import com.ims.domain.Client;

public interface ClientService
{
	public void addClient(Client client);
	public void removeClientByName(String name);
	public Client getClientByName(String name);
	public List<Client> getAllClients();
}
