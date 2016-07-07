package com.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.ProductCategoryDAO;
import com.ims.domain.ProductCategory;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService
{
	@Autowired
	private ProductCategoryDAO productCategoryDAOImpl;
	
	@Override
	public void addProductCategory(ProductCategory productCategory)
	{
		productCategoryDAOImpl.createNewProductCategory(productCategory);
	}
	
	@Override
	public void removeProductCategoryById(Long id)
	{
		productCategoryDAOImpl.removeProductCategoryById(id);
	}
	
	@Override
	public ProductCategory getProductCategoryById(Long id)
	{
		return productCategoryDAOImpl.getProductCategoryById(id);
	}
	
	@Override
	public List<ProductCategory> getAllProductCategorys()
	{
		return productCategoryDAOImpl.getAllProductCategorys();
	}
}

