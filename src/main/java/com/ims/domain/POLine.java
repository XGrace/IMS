package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="IMS_PO_LINE")
public class POLine
{
	@Id
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ORDER_NUMBER", referencedColumnName="ORDER_NUMBER")
	private PurchaseOrder purchaseOrder;
	
	@Id
	@SequenceGenerator(name="POLineSeq", sequenceName="IMS_PO_LINE_SEQ", allocationSize=1)
	@GeneratedValue(generator="POLineSeq", strategy=GenerationType.SEQUENCE)
	@Column(name="LINE_NUMBER")
	private Long lineNumber;
	
	@Column(name="UNIT_PRICE")
	private Double unitPrice;
	
	@Column(name="QUANTITY_ORDERED")
	private Long quantityOrdered;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PRODUCT_UPC", referencedColumnName="PRODUCT_UPC")
	private Product product;
	
	@Override
	public String toString()
	{
		return "POLine [purchaseOrder=" + purchaseOrder + ", lineNumber=" + lineNumber + ", unitPrice=" + unitPrice
				+ ", quantityOrdered=" + quantityOrdered + ", product=" + product + "]";
	}

	public POLine()
	{
	}
		
	public POLine(PurchaseOrder purchaseOrder, Long lineNumber, Double unitPrice, Long quantityOrdered, Product product)
	{
		this.purchaseOrder = purchaseOrder;
		this.lineNumber = lineNumber;
		this.unitPrice = unitPrice;
		this.quantityOrdered = quantityOrdered;
		this.product = product;
	}

	public PurchaseOrder getPurchaseOrder()
	{
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder)
	{
		this.purchaseOrder = purchaseOrder;
	}

	public Long getLineNumber()
	{
		return lineNumber;
	}
	
	public void setLineNumber(Long lineNumber)
	{
		this.lineNumber = lineNumber;
	}
	
	public Double getUnitPrice()
	{
		return unitPrice;
	}
	
	public void setUnitPrice(Double unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	
	public Long getQuantityOrdered()
	{
		return quantityOrdered;
	}
	
	public void setQuantityOrdered(Long quantityOrdered)
	{
		this.quantityOrdered = quantityOrdered;
	}
	
	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}
}
