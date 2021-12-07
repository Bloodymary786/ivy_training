package com.productapp.model.dao;
import java.util.*;
public interface ProductDao {
	public List<Product> getAllProducts();
	public Product getById(int id);
	public Product deleteProduct(int id);
	public Product addProduct(Product product);
	public Product updateProduct(int id, Product product);
	
}
