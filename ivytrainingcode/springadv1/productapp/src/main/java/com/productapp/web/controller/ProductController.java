package com.productapp.web.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.productapp.dao.Product;
import com.productapp.service.ProductService;

@Controller
public class ProductController {

	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	///
	@GetMapping
	public String home() {
		return "redirect:allproducts";
	}
	
	// code to display all products
	@GetMapping(path = "allproducts")
	public ModelAndView displayAllProducts(ModelAndView mv) {
		mv.addObject("products", productService.getAllProducts());
		mv.setViewName("allprods");
		return mv;
	}

	// -------------delete an product

	@GetMapping(path = "deleteProduct")
	public String deleteProduct(@RequestParam(name = "id") int id) {
		productService.deleteProduct(id);
		return "redirect:allproducts";
	}

	// ------------update ------------------------
	@GetMapping(path = "updateProduct")
	public String updateGetProduct(ModelMap map, @RequestParam(name = "id") int id) {
		map.addAttribute("product", productService.getById(id));// u are keeping a blank form bean
		return "updateproduct";
	}

	// -----------add a new product--------------
	@GetMapping(path = "addProduct")
	public String addGetProduct(ModelMap map) {
		map.addAttribute("product", new Product());// u are keeping a blank form bean
		return "addproduct";
	}

	@PostMapping(path = "addProduct")
	public String addPostProduct(@ModelAttribute(name = "product") Product product) {
		int id = product.getId();
		if (id == 0)
			productService.addProduct(product);
		else
			productService.updateProduct(id, product);
		return "redirect:allproducts";
	}

	// if a method have annotation @ModelAttribute then spring mvc give gurantee to
	// run this
	// method before every req and return of this method is going to put into the
	// req scope
	// with key "categories"
	@ModelAttribute(name = "categories")
	public List<String> getAllCategories() {
		// we can take categories from db also
		return Arrays.asList("Electronics", "Books", "Shooes");
	}
}
