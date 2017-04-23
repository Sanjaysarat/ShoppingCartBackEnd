package com.niit.sanshopbackend;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.sanshopbackend.dao.CategoryDAO;
import com.niit.sanshopbackend.dao.UserDAO;
import com.niit.sanshopbackend.models.User;

import junit.framework.Assert;

public class UserTestCase {

	@Autowired
private static User user;
	
	@Autowired
private static UserDAO userDAO;
	
	@BeforeClass
	public static void initialisze(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		user = (User) context.getBean("user");
		userDAO = (UserDAO) context.getBean("userDAO");
		
	}
	
	
	/*
	@Test
	public void getUserByIdTestCase(){
		user = userDAO.getUser("niit");
		Assert.assertNotNull("getUserByIdTestCase", user);
	}*/
	
	@Test
	public void updateUserTestCase(){
		user.setId("001");
		user.setName("sanjay");
		user.setPassword("123");
		user.setMail("sanjay");
		user.setContact("4324543");
		user.setRole("ROLE_ADMIN");	
		
		boolean flag = userDAO.save(user);
		assertEquals("updateUserTestCase",true,flag);
	}
	

}
