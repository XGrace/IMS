package com.ims.domain;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="IMS_PRODUCT")
public class Product
{
	@Id
	@Column(name="PRODUCT_UPC")
	@SequenceGenerator(name="productSeq", sequenceName="IMS_PRODUCT_SEQ", allocationSize=1)
	@GeneratedValue(generator="productSeq", strategy=GenerationType.SEQUENCE)
	private Long productUpc;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="PRODUCT_DESCRIPTION")
	private String productDescription;
	
	@Column(name="SHORT_NAME")
	private String shortName;
	
	@Column(name="UNIT_COST")
	private Double unitCost;
	
	@Column(name="REORDER_QUANTITY")
	private Long reorderQuantity;
	
	@Column(name="RETAIL_PRICE")
	private Double retailPrice;
	
	@Column(name="PRODUCT_WEIGHT")
	private Double productWeight;
	
	@Column(name="PRODUCT_IMAGE")
	private Blob productImage;
	
	@Override
	public String toString()
	{
		return "Product [productUpc=" + productUpc + ", productName=" + productName + ", productDescription="
				+ productDescription + ", shortName=" + shortName + ", unitCost=" + unitCost + ", reorderQuantity="
				+ reorderQuantity + ", retailPrice=" + retailPrice + ", productWeight=" + productWeight
				+ ", productImage=" + productImage + "]";
	}

	public Product()
	{
	}

	public Product(Long productUpc, String productName, String productDescription, String shortName, Double unitCost,
			Long reorderQuantity, Double retailPrice, Double productWeight, Blob productImage)
	{
		this.productUpc = productUpc;
		this.productName = productName;
		this.productDescription = productDescription;
		this.shortName = shortName;
		this.unitCost = unitCost;
		this.reorderQuantity = reorderQuantity;
		this.retailPrice = retailPrice;
		this.productWeight = productWeight;
		this.productImage = productImage;
	}

	public Long getProductUpc()
	{
		return productUpc;
	}

	public void setProductUpc(Long productUpc)
	{
		this.productUpc = productUpc;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public String getProductDescription()
	{
		return productDescription;
	}

	public void setProductDescription(String productDescription)
	{
		this.productDescription = productDescription;
	}

	public String getShortName()
	{
		return shortName;
	}

	public void setShortName(String shortName)
	{
		this.shortName = shortName;
	}

	public Double getUnitCost()
	{
		return unitCost;
	}

	public void setUnitCost(Double unitCost)
	{
		this.unitCost = unitCost;
	}

	public Long getReorderQuantity()
	{
		return reorderQuantity;
	}

	public void setReorderQuantity(Long reorderQuantity)
	{
		this.reorderQuantity = reorderQuantity;
	}

	public Double getRetailPrice()
	{
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice)
	{
		this.retailPrice = retailPrice;
	}

	public Double getProductWeight()
	{
		return productWeight;
	}

	public void setProductWeight(Double productWeight)
	{
		this.productWeight = productWeight;
	}

	public Blob getProductImage()
	{
		return productImage;
	}

	public void setProductImage(Blob productImage)
	{
		this.productImage = productImage;
	}
}
