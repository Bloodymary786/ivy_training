package com.productapp.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

	private SessionFactory factory;

	@Autowired
	public ProductDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}

	private Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public List<Product> getAllProducts() {
		return getSession().createQuery("select p from Product p", Product.class).getResultList();
	}

	@Override
	public Product getById(int id) {
		Product product = getSession().find(Product.class, id);
		if (product == null)
			throw new ProductNotFoundException("product with id " + id + " is not found");
		return product;
	}

	@Override
	public Product deleteProduct(int id) {
		Product product = getById(id);
		getSession().delete(product);
		return product;
	}

	@Override
	public Product addProduct(Product product) {
		getSession().save(product);
		return product;
	}

	@Override
	public Product updateProduct(int id, Product product) {
		Product productToUpdate = getById(id);
		productToUpdate.setPrice(product.getPrice());
		productToUpdate.setQuantity(product.getQuantity());
		getSession().merge(productToUpdate);
		return product;

	}

}
