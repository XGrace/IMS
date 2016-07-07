package com.ims.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_CATEGORIES")
public class ProductCategories
{
	@Id
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PRODUCT_UPC", referencedColumnName="PRODUCT_UPC")
	private Product product;
	
	@Id
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CATEGORY_ID", referencedColumnName="CATEGORY_ID")
	private ProductCategory productCategory;

	@Override
	public String toString()
	{
		return "ProductCategories [product=" + product + ", productCategory=" + productCategory + "]";
	}

	public ProductCategories()
	{
	}

	public ProductCategories(Product product, ProductCategory productCategory)
	{
		this.product = product;
		this.productCategory = productCategory;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}

	public ProductCategory getProductCategory()
	{
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory)
	{
		this.productCategory = productCategory;
	}
}
