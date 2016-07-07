package com.ims.domain;

import java.sql.Date;

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
@Table(name="IMS_PURCHASE_ORDER")
public class PurchaseOrder
{
	@Id
	@Column(name="ORDER_NUMBER")
	@SequenceGenerator(name="purchaseOrderSeq", sequenceName="IMS_PURCHASE_ORDER_SEQ", allocationSize=1)
	@GeneratedValue(generator="purchaseOrderSeq", strategy=GenerationType.SEQUENCE)
	private Long orderNumber;
	
	@Column(name="SUBTOTAL")
	private Double subtotal;
	
	@Column(name="PURCHASE_DATE")
	private Date purchaseDate;
	
	@Column(name="TAX_AMOUNT")
	private Double taxAmount;
	
	@Column(name="PO_TOTAL")
	private Double poTotal;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CLIENT_ID", referencedColumnName="IMS_CLIENT_ID")
	private Client client;

	@Override
	public String toString()
	{
		return "PurchaseOrder [orderNumber=" + orderNumber + ", subtotal=" + subtotal + ", purchaseDate=" + purchaseDate
				+ ", taxAmount=" + taxAmount + ", poTotal=" + poTotal + ", client=" + client + "]";
	}

	public PurchaseOrder()
	{
	}

	public PurchaseOrder(Long orderNumber, Double subtotal, Date purchaseDate, Double taxAmount, Double poTotal,
			Client client)
	{
		this.orderNumber = orderNumber;
		this.subtotal = subtotal;
		this.purchaseDate = purchaseDate;
		this.taxAmount = taxAmount;
		this.poTotal = poTotal;
		this.client = client;
	}

	public Long getOrderNumber()
	{
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber)
	{
		this.orderNumber = orderNumber;
	}

	public Double getSubtotal()
	{
		return subtotal;
	}

	public void setSubtotal(Double subtotal)
	{
		this.subtotal = subtotal;
	}

	public Date getPurchaseDate()
	{
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate)
	{
		this.purchaseDate = purchaseDate;
	}

	public Double getTaxAmount()
	{
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount)
	{
		this.taxAmount = taxAmount;
	}

	public Double getPoTotal()
	{
		return poTotal;
	}

	public void setPoTotal(Double poTotal)
	{
		this.poTotal = poTotal;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}
}
