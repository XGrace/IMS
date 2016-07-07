package com.ims.dao;

import java.util.List;

import com.ims.domain.StateAbbrv;

public interface StateAbbrvDAO
{
	public void createNewStateAbbrv(StateAbbrv stateAbbrv);
	
	public void removeStateAbbrvById(Long id);
	
	public StateAbbrv getStateAbbrvById(Long id);
	
	public List<StateAbbrv> getAllStateAbbrvs();
}
