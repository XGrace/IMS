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
@Table(name="IMS_ADDRESS")
public class Address
{
	@Id
	@Column(name="IMS_ADDRESS_ID")
	@SequenceGenerator(name="addressSeq", sequenceName="IMS_ADDRESS_SEQ", allocationSize=1)
	@GeneratedValue(generator="addressSeq", strategy=GenerationType.SEQUENCE)
	private Long addressId;
	
	@Column(name="STREET_ADDRESS_1")
	private String streetAddress1;
	
	@Column(name="STREET_ADDRESS_2")
	private String streetAddress2;
	
	@Column(name="ADDRESS_CITY")
	private String city;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="STATE_ID", referencedColumnName="ABBRV_ID")
	private StateAbbrv stateAbbrv;
	
	@Column(name="ADDRESS_ZIP")
	private String addressZip;
	
	@Override
	public String toString()
	{
		return "Address [addressId=" + addressId + ", streetAddress1=" + streetAddress1 + ", streetAddress2="
				+ streetAddress2 + ", city=" + city + ", stateAbbrv=" + stateAbbrv + ", addressZip=" + addressZip + "]";
	}

	public Address()
	{
	}

	public Address(Long addressId, String streetAddress1, String streetAddress2, String city, StateAbbrv stateAbbrv,
			String addressZip)
	{
		this.addressId = addressId;
		this.streetAddress1 = streetAddress1;
		this.streetAddress2 = streetAddress2;
		this.city = city;
		this.stateAbbrv = stateAbbrv;
		this.addressZip = addressZip;
	}

	public Long getAddressId()
	{
		return addressId;
	}

	public void setAddressId(Long addressId)
	{
		this.addressId = addressId;
	}

	public String getStreetAddress1()
	{
		return streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1)
	{
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2()
	{
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2)
	{
		this.streetAddress2 = streetAddress2;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public StateAbbrv getStateAbbrv()
	{
		return stateAbbrv;
	}

	public void setStateAbbrv(StateAbbrv stateAbbrv)
	{
		this.stateAbbrv = stateAbbrv;
	}

	public String getAddressZip()
	{
		return addressZip;
	}

	public void setAddressZip(String addressZip)
	{
		this.addressZip = addressZip;
	}
}
