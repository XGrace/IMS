package com.ims.service;

import java.util.List;

import com.ims.domain.ProductCategory;

public interface ProductCategoryService
{
	public void addProductCategory(ProductCategory stateAbbrv);
	
	public void removeProductCategoryById(Long id);
	
	public ProductCategory getProductCategoryById(Long id);
	
	public List<ProductCategory> getAllProductCategorys();
}
