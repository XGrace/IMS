package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="IMS_STATE_ABBRV")
public class StateAbbrv
{
	@Id
	@Column(name="ABBRV_ID")
	@SequenceGenerator(name="stateAbbrvSeq", sequenceName="IMS_STATE_ABBRV_SEQ", allocationSize=1)
	@GeneratedValue(generator="stateAbbrvSeq", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="STATE_NAME")
	private String name;
	
	@Column(name="STATE_ABBRV")
	private String abbrv;

	@Override
	public String toString()
	{
		return "StateAbbrv [id=" + id + ", name=" + name + ", abbrv=" + abbrv + "]";
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAbbrv()
	{
		return abbrv;
	}

	public void setAbbrv(String abbrv)
	{
		this.abbrv = abbrv;
	}
}
