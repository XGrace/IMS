package com.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ims.dao.ProductDAO;
import com.ims.domain.Product;

public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductDAO productDAOImpl;
	
	@Override
	public void addProduct(Product product)
	{
		productDAOImpl.createNewProduct(product);
	}

	@Override
	public void removeProductByName(String name)
	{
		productDAOImpl.removeProductByName(name);
	}

	@Override
	public List<Product> getAllProducts()
	{
		return productDAOImpl.getAllProducts();
	}
}
