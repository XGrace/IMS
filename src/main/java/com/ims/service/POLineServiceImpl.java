package com.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.POLineDAO;
import com.ims.domain.POLine;

@Service
public class POLineServiceImpl implements POLineService
{
	@Autowired
	private POLineDAO POLineDAOImpl;
	
	@Override
	public void addPOLine(POLine poLine)
	{
		POLineDAOImpl.createNewPOLine(poLine);
	}
	
	@Override
	public void removePOLineByLineNumber(Long lineNumber)
	{
		POLineDAOImpl.removePOLineByLineNumber(lineNumber);
	}
	
	@Override
	public POLine getPOLineByLineNumber(Long lineNumber)
	{
		return POLineDAOImpl.getPOLineByLineNumber(lineNumber);
	}
	
	@Override
	public List<POLine> getAllPOLines()
	{
		return POLineDAOImpl.getAllPOLines();
	}
}
