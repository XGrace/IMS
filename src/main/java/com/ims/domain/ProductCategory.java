package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="IMS_PRODUCT_CATEGORY")
public class ProductCategory
{
	@Id
	@Column(name="CATEGORY_ID")
	@SequenceGenerator(name="productCategorySeq", sequenceName="IMS_PRODUCT_CATEGORIES_SEQ", allocationSize=1)
	@GeneratedValue(generator="productCategorySeq", strategy=GenerationType.SEQUENCE)
	private Long categoryId;
	
	@Column(name="CATEGORY_DESCRIPTION")
	private String categoryDescription;

	@Override
	public String toString()
	{
		return "ProductCategory [categoryId=" + categoryId + ", categoryDescription=" + categoryDescription + "]";
	}

	public ProductCategory()
	{
	}

	public ProductCategory(Long categoryId, String categoryDescription)
	{
		this.categoryId = categoryId;
		this.categoryDescription = categoryDescription;
	}

	public Long getCategoryId()
	{
		return categoryId;
	}

	public void setCategoryId(Long categoryId)
	{
		this.categoryId = categoryId;
	}

	public String getCategoryDescription()
	{
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription)
	{
		this.categoryDescription = categoryDescription;
	}
}
