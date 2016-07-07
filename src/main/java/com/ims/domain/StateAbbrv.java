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
	private Long abbrvId;
	
	@Column(name="STATE_NAME")
	private String stateName;
	
	@Column(name="STATE_ABBRV")
	private String stateAbbrv;

	@Override
	public String toString()
	{
		return "StateAbbrv [abbrvId=" + abbrvId + ", stateName=" + stateName + ", stateAbbrv=" + stateAbbrv + "]";
	}
	
	public StateAbbrv()
	{
	}

	public StateAbbrv(Long abbrvId, String stateName, String stateAbbrv)
	{
		this.abbrvId = abbrvId;
		this.stateName = stateName;
		this.stateAbbrv = stateAbbrv;
	}

	public Long getAbbrvId()
	{
		return abbrvId;
	}

	public void setAbbrvId(Long abbrvId)
	{
		this.abbrvId = abbrvId;
	}

	public String getStateName()
	{
		return stateName;
	}

	public void setStateName(String stateName)
	{
		this.stateName = stateName;
	}

	public String getStateAbbrv()
	{
		return stateAbbrv;
	}

	public void setStateAbbrv(String stateAbbrv)
	{
		this.stateAbbrv = stateAbbrv;
	}
}
