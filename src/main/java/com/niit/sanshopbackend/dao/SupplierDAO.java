package  com.niit.sanshopbackend.dao;

import java.util.List;

import  com.niit.sanshopbackend.models.Supplier;

public interface SupplierDAO {

	public List<Supplier> list();
	
	public boolean save(Supplier supplier);
	
	public boolean update(Supplier supplier);
	
	public boolean delete(Supplier supplier);
	
	public Supplier getSupplierById(String id);
}
