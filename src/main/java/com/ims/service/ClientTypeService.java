package com.ims.service;

import java.util.List;

import com.ims.domain.ClientType;

public interface ClientTypeService
{
	public void addClientType(ClientType clientType);
	public void removeClientTypeById(Long id);
	public ClientType getClientTypeById(Long id);
	public List<ClientType> getAllClientTypes();
}
