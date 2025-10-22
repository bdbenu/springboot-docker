package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
public class SpringbootRestController {
	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> getProduct() {
		
		return productService.getProduct();
	}

}
