package com.niit.sanshopbackend.dao;

import java.util.List;

import  com.niit.sanshopbackend.models.Product;

public interface ProductDAO {
	
	public List<Product> list();
	
	public boolean save(Product product);
	
	public boolean delete(Product product);
	
	public boolean update(Product product);
	
	public Product getProductById(String id);

}
