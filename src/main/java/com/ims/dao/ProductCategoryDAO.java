package com.ims.dao;

import java.util.List;

import com.ims.domain.ProductCategory;

public interface ProductCategoryDAO
{
	public void createNewProductCategory(ProductCategory stateAbbrv);
	
	public void removeProductCategoryById(Long id);
	
	public ProductCategory getProductCategoryById(Long id);
	
	public List<ProductCategory> getAllProductCategorys();
}
