package com.ims.dao;

import java.util.List;

import com.ims.domain.PurchaseOrder;

public interface PurchaseOrderDAO
{
	public void createNewPurchaseOrder(PurchaseOrder purchaseOrder);
	
	public void removePurchaseOrderByOrderNumber(Long orderNumber);
	
	public PurchaseOrder getPurchaseOrderByOrderNumber(Long orderNumber);
	
	public List<PurchaseOrder> getAllPurchaseOrders();
}
