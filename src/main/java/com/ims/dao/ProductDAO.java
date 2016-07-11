package com.ims.dao;

import java.util.List;

import com.ims.domain.Product;

public interface ProductDAO
{
	public void createNewProduct(Product product);
	
	public void removeProductById(Long id);
	public void removeProductByName(String name);
	
	public Product getProductById(Long id);
	public Product getProductByName(String name);
	public Product getProductByShortName(String shortName);
	
	public List<Product> getAllProducts();
	public List<Product> getAllProductsByCategory(String category);
}
