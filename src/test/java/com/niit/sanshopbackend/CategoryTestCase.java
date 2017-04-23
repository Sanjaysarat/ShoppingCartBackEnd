package com.niit.sanshopbackend;


import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.sanshopbackend.dao.CategoryDAO;
import com.niit.sanshopbackend.models.Category;

import junit.framework.Assert;

public class CategoryTestCase {

	@Autowired
	private static Category category;
	
	@Autowired
	private static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void init(){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		category = (Category) context.getBean("category");
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		
	}
	
	@Test
	public void createCategoryTestCase(){
		category.setId("sanj");
		category.setName("sanj");
		category.setDescription("Beaut");
		
		boolean flag = categoryDAO.save(category);
		
		Assert.assertEquals("createCategoryTestCase"  ,true, flag);
	}
	/*
	@Test
	public void getCategoryById(){
		category = categoryDAO.getCategoryById("sanj");
		
		Assert.assertNotNull("getCategoryById", category);
	}
	/*
	@Test
	public void deleteCategoryTestCase(){
		boolean flag = categoryDAO.delete("sanj");
		Assert.assertEquals("deleteCategoryTestCase"  ,true, flag);
	}
	
	@Test
public void updateCategoryTestCase(){
		category.setId("sanj");
		category.setName("sanj33");
		category.setDescription("abcdefgh");
	boolean flag = categoryDAO.update(category);
	Assert.assertEquals("updateCategoryTestCase"  ,true, flag);
	
}
*/
}
