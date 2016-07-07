package com.ims.service;

import java.util.List;

import com.ims.domain.StateAbbrv;

public interface StateAbbrvService
{
	public void addStateAbbrv(StateAbbrv stateAbbrv);
	
	public void removeStateAbbrvById(Long id);
	
	public StateAbbrv getStateAbbrvById(Long id);
	
	public List<StateAbbrv> getAllStateAbbrvs();
}
