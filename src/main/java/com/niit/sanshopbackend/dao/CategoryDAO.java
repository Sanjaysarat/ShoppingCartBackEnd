package com.niit.sanshopbackend.dao;

import java.util.List;

import  com.niit.sanshopbackend.models.Category;

public interface CategoryDAO {
	
	public List<Category> list();
	
	public boolean save(Category category);
	
	public boolean delete(Category category);
	
	public boolean update(Category category);
	
	public boolean delete(String id);
	
	public Category getCategoryById(String id);
	
	public Category getCategoryByName(String name);
	

}
