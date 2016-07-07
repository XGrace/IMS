package com.ims.service;

import java.util.List;

import com.ims.domain.PurchaseOrder;

public interface PurchaseOrderService
{
	public void addPurchaseOrder(PurchaseOrder purchaseOrder);
	
	public void removePurchaseOrderByOrderNumber(Long orderNumber);
	
	public PurchaseOrder getPurchaseOrderByOrderNumber(Long orderNumber);
	
	public List<PurchaseOrder> getAllPurchaseOrders();
}
