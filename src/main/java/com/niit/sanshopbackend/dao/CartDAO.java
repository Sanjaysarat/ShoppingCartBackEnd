package com.niit.sanshopbackend.dao;

import java.util.List;

import  com.niit.sanshopbackend.models.MyCart;

public interface CartDAO {
	
	
	public List<MyCart> list(String user_id);
	
	public MyCart get(String id);
	
	public boolean save(MyCart myCart);
	
	public Double getTotalAmount(String id);

	public boolean update(MyCart myCart);
	
	public boolean delete(MyCart myCart);
	
	
}
