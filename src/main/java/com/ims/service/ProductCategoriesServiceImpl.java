package com.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.ProductCategoriesDAO;
import com.ims.domain.Product;
import com.ims.domain.ProductCategories;

@Service
public class ProductCategoriesServiceImpl implements ProductCategoriesService
{
	@Autowired
	private ProductCategoriesDAO productCategoriesDAOImpl;
	
	@Override
	public void addProductCategories(ProductCategories productCategories)
	{
		productCategoriesDAOImpl.createNewProductCategories(productCategories);
	}
	
	@Override
	public void removeProductCategoriesByUpc(Long upc)
	{
		productCategoriesDAOImpl.removeProductCategoriesByUpc(upc);
	}
	
	@Override
	public void removeProductCategoriesById(Long id)
	{
		productCategoriesDAOImpl.removeProductCategoriesById(id);
	}
	
	@Override
	public ProductCategories getProductCategoriesByUpc(Long upc)
	{
		return productCategoriesDAOImpl.getProductCategoriesByUpc(upc);
	}
	
	@Override
	public List<ProductCategories> getProductCategoriesById(Long id)
	{
		return productCategoriesDAOImpl.getProductCategoriesById(id);
	}
	
	@Override
	public List<ProductCategories> getAllProductCategories()
	{
		return productCategoriesDAOImpl.getAllProductCategories();
	}
	
	@Override
	public List<Product> getProductsByCategoryId(Long categoryId)
	{
		return productCategoriesDAOImpl.getProductsByCategoryId(categoryId);
	}
}
