package com.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.StateAbbrvDAO;
import com.ims.domain.StateAbbrv;

@Service
public class StateAbbrvServiceImpl implements StateAbbrvService
{
	@Autowired
	private StateAbbrvDAO stateAbbrvDAOImpl;
	
	@Override	
	public void addStateAbbrv(StateAbbrv stateAbbrv)
	{
		stateAbbrvDAOImpl.createNewStateAbbrv(stateAbbrv);
	}
	
	@Override
	public void removeStateAbbrvById(Long id)
	{
		stateAbbrvDAOImpl.removeStateAbbrvById(id);
	}
	
	@Override	
	public StateAbbrv getStateAbbrvById(Long id)
	{
		return stateAbbrvDAOImpl.getStateAbbrvById(id);
	}

	@Override
	public List<StateAbbrv> getAllStateAbbrvs()
	{
		return stateAbbrvDAOImpl.getAllStateAbbrvs();
	}
}
