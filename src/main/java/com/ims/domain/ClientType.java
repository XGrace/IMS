package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="IMS_CLIENT_TYPE")
public class ClientType
{
	@Id
	@Column(name="CLIENT_TYPE_ID")
	@SequenceGenerator(name="clientTypeSeq", sequenceName="IMS_CLIENT_TYPE_SEQ", allocationSize=1)
	@GeneratedValue(generator="clientTypeSeq", strategy=GenerationType.SEQUENCE)
	private Long clientTypeId;
	
	@Column(name="CLIENT_TYPE")
	private String clientType;

	@Override
	public String toString()
	{
		return "ClientType [clientTypeId=" + clientTypeId + ", clientType=" + clientType + "]";
	}

	public ClientType()
	{
	}

	public ClientType(Long clientTypeId, String clientType)
	{
		this.clientTypeId = clientTypeId;
		this.clientType = clientType;
	}

	public Long getClientTypeId()
	{
		return clientTypeId;
	}

	public void setClientTypeId(Long clientTypeId)
	{
		this.clientTypeId = clientTypeId;
	}

	public String getClientType()
	{
		return clientType;
	}

	public void setClientType(String clientType)
	{
		this.clientType = clientType;
	}
}
