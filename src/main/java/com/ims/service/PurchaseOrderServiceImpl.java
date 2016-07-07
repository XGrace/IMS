package com.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.PurchaseOrderDAO;
import com.ims.domain.PurchaseOrder;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService
{
	@Autowired
	private PurchaseOrderDAO purchaseOrderDAOImpl;
	
	@Override
	public void addPurchaseOrder(PurchaseOrder purchaseOrder)
	{
		purchaseOrderDAOImpl.createNewPurchaseOrder(purchaseOrder);
	}
	
	@Override
	public void removePurchaseOrderByOrderNumber(Long orderNumber)
	{
		purchaseOrderDAOImpl.removePurchaseOrderByOrderNumber(orderNumber);
	}
	
	@Override
	public PurchaseOrder getPurchaseOrderByOrderNumber(Long orderNumber)
	{
		return purchaseOrderDAOImpl.getPurchaseOrderByOrderNumber(orderNumber);
	}
	
	@Override
	public List<PurchaseOrder> getAllPurchaseOrders()
	{
		return purchaseOrderDAOImpl.getAllPurchaseOrders();
	}
}
