package com.ims.dao;

import java.util.List;

import com.ims.domain.POLine;

public interface POLineDAO
{
	public void createNewPOLine(POLine poLine);
	
	public void removePOLineByLineNumber(Long lineNumber);
	
	public POLine getPOLineByLineNumber(Long lineNumber);
	
	public List<POLine> getAllPOLines();
}
