package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Product {

	public Product() {
		super();
	}

	private Integer prodID;
	
	private String prodName;
	
	private String prodDesc;
	
	private Integer price;

	public Integer getProdID() {
		return prodID;
	}

	public void setProdID(Integer prodID) {
		this.prodID = prodID;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Product(Integer prodID, String prodName, String prodDesc, Integer price) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.price = price;
	}
	

}
