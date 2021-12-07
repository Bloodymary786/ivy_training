package com.productapp.model.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "product_table")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotEmpty(message="ajflkdjfd")
	private String name;
	
	@NotNull(message="price can not be null")
	@Min(value=10, message="min price should be more then 10")
	@Max(value=100000, message="max price should be less then 100000")
	private Double price;
	
	@NotNull(message="quantity can not be null")
	@Min(value=1, message="min quantity should be more then 1")
	@Max(value=100, message="max price should be less then 100")
	private Integer quantity;
	
	@NotEmpty(message="category cant left blank")
	private String category;
	
	@NotNull(message="date can not be null")
	@Past(message = "date should be past date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date mgtDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getMgtDate() {
		return mgtDate;
	}

	public void setMgtDate(Date mgtDate) {
		this.mgtDate = mgtDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product() {
	}

	public Product(String name, Double price, int quantity, String category, Date mgtDate) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.mgtDate = mgtDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", category="
				+ category + ", mgtDate=" + mgtDate + "]";
	}

}
