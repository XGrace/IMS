package com.ims.dao;

import java.util.List;

import com.ims.domain.Product;

public interface ProductDAO
{
	public void createNewProduct(Product product);
	public void removeProductByName(String name);
	public Product getProductByName(String name);
	public Product getProducyByShortName(String shortName);
	public List<Product> getAllProducts();
}
