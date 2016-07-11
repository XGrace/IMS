package com.ims.service;

import java.util.List;

import com.ims.domain.Product;
import com.ims.domain.ProductCategories;

public interface ProductCategoriesService
{
	public void addProductCategories(ProductCategories productCategories);
	
	public void removeProductCategoriesByUpc(Long upc);
	public void removeProductCategoriesById(Long id);
	
	public ProductCategories getProductCategoriesByUpc(Long upc);
	public ProductCategories getProductCategoriesById(Long id);
	
	public List<ProductCategories> getAllProductCategories();
	public List<Product> getProductsByCategory(Long categoryId);
}
