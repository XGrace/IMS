package com.ims.service;

import java.util.List;

import com.ims.domain.Product;

public interface ProductService
{
	public void addProduct(Product product);
	public void removeProductByName(String name);
	public Product getProductByName(String name);
	public List<Product> getAllProducts();
}
