package com.ims.service;

import java.util.List;

import com.ims.domain.POLine;

public interface POLineService
{
	public void addPOLine(POLine poLine);

	public void removePOLineByLineNumber(Long lineNumber);
	
	public POLine getPOLineByLineNumber(Long lineNumber);
	
	public List<POLine> getAllPOLines();
}
