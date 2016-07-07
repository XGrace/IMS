package com.ims.dao;

import java.util.List;

import com.ims.domain.ClientType;

public interface ClientTypeDAO
{
	public void createNewClientType(ClientType clientType);
	
	public void removeClientTypeById(Long id);
	
	public ClientType getClientTypeById(Long id);
	
	public List<ClientType> getAllClientTypes();
}
