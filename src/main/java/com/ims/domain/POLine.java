package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="IMS_PO_LINE")
public class POLine
{
	@Id
	@Column(name="ORDER_NUMBER")
	@SequenceGenerator(name="POLineSeq", sequenceName="IMS_PO_LINE_SEQ", allocationSize=1)
	@GeneratedValue(generator="POLineSeq", strategy=GenerationType.SEQUENCE)
	private Long orderNumber;
	
	@Column(name="LINE_NUMBER")
	private Long lineNumber;
	
	@Column(name="UNIT_PRICE")
	private Double unitPrice;
	
	@Column(name="QUANTITY_ORDERED")
	private Long quantityOrdered;
	
	@Column(name="PRODUCT_UPC")
	private Long productUpc;
	
	@Override
	public String toString()
	{
		return "POLine [orderNumber=" + orderNumber + ", lineNumber=" + lineNumber + ", unitPrice=" + unitPrice
				+ ", quantityOrdered=" + quantityOrdered + ", productUpc=" + productUpc + "]";
	}

	public POLine()
	{
	}
	
	public POLine(Long orderNumber, Long lineNumber, Double unitPrice, Long quantityOrdered, Long productUpc)
	{
		this.orderNumber = orderNumber;
		this.lineNumber = lineNumber;
		this.unitPrice = unitPrice;
		this.quantityOrdered = quantityOrdered;
		this.productUpc = productUpc;
	}
	
	public Long getOrderNumber()
	{
		return orderNumber;
	}
	
	public void setOrderNumber(Long orderNumber)
	{
		this.orderNumber = orderNumber;
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
	
	public Long getProductUpc()
	{
		return productUpc;
	}
	
	public void setProductUpc(Long productUpc)
	{
		this.productUpc = productUpc;
	}
}
