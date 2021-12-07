package com.productapp.model.service;

import java.util.List;

import com.productapp.model.dao.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product getById(int id);
	public Product deleteProduct(int id);
	public Product addProduct(Product product);
	public Product updateProduct(int id, Product product);
}
