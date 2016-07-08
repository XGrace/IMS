package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="IMS_CLIENT")
public class Client
{
	@Id
	@Column(name="IMS_CLIENT_ID")
	@SequenceGenerator(name="clientSeq", sequenceName="IMS_CLIENT_SEQ", allocationSize=1)
	@GeneratedValue(generator="clientSeq", strategy=GenerationType.SEQUENCE)
	private Long clientId;
	
	@Column(name="CLIENT_NAME")
	private String clientName;
	
	@Column(name="CLIENT_EMAIL")
	private String clientEmail;
	
	@Column(name="POINT_OF_CONTACT_NAME")
	private String pointOfContactName;
	
	@Column(name="CLIENT_PHONE")
	private String clientPhone;
	
	@Column(name="CLIENT_FAX")
	private String clientFax;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ADDRESS_ID", referencedColumnName="IMS_ADDRESS_ID")
	private Address address;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CLIENT_TYPE_ID", referencedColumnName="CLIENT_TYPE_ID")
	private ClientType client;

	@Override
	public String toString()
	{
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", clientEmail=" + clientEmail
				+ ", pointOfContactName=" + pointOfContactName + ", clientPhone=" + clientPhone + ", clientFax="
				+ clientFax + ", address=" + address + ", client=" + client + "]";
	}

	public Client()
	{
	}

	public Client(Long clientId, String clientName, String clientEmail, String pointOfContactName, String clientPhone,
			String clientFax, Address address, ClientType client)
	{
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientEmail = clientEmail;
		this.pointOfContactName = pointOfContactName;
		this.clientPhone = clientPhone;
		this.clientFax = clientFax;
		this.address = address;
		this.client = client;
	}

	public Long getClientId()
	{
		return clientId;
	}

	public void setClientId(Long clientId)
	{
		this.clientId = clientId;
	}

	public String getClientName()
	{
		return clientName;
	}

	public void setClientName(String clientName)
	{
		this.clientName = clientName;
	}

	public String getClientEmail()
	{
		return clientEmail;
	}

	public void setClientEmail(String clientEmail)
	{
		this.clientEmail = clientEmail;
	}

	public String getPointOfContactName()
	{
		return pointOfContactName;
	}

	public void setPointOfContactName(String pointOfContactName)
	{
		this.pointOfContactName = pointOfContactName;
	}

	public String getClientPhone()
	{
		return clientPhone;
	}

	public void setClientPhone(String clientPhone)
	{
		this.clientPhone = clientPhone;
	}

	public String getClientFax()
	{
		return clientFax;
	}

	public void setClientFax(String clientFax)
	{
		this.clientFax = clientFax;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public ClientType getClient()
	{
		return client;
	}

	public void setClient(ClientType client)
	{
		this.client = client;
	}
}
