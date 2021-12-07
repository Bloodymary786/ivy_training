package com.productapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.model.dao.Product;
import com.productapp.model.dao.ProductDao;
@Service(value = "ps")
@Transactional
public class ProductServiceImpl implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	@Override
	public Product getById(int id) {
		return productDao.getById(id);
	}

	@Override
	public Product deleteProduct(int id) {
		return productDao.deleteProduct(id);
	}

	@Override
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	}

	@Override
	public Product updateProduct(int id, Product product) {
		return productDao.updateProduct(id, product);
	}

}
