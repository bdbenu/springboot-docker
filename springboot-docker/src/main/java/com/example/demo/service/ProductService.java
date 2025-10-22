package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
@Service
public class ProductService {
	List<Product> productList = new ArrayList<>();

	public List<Product> getProduct() {

		productList.add(new Product(1, "Iphone", "Smart phone", 89000));
		productList.add(new Product(2, "Macbook Air", "Laptop", 256000));
		productList.add(new Product(3, "Washing Machine", "Washing machine", 30000));
		productList.add(new Product(4, "Fridge", "Fridge", 70000));
		return productList;
	}

}
