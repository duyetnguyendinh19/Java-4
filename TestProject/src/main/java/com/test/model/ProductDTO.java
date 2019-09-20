package com.test.model;

import java.io.Serializable;

public class ProductDTO implements Serializable{

	private Product product;
	private int quantity;
	
	public ProductDTO() {
		super();
	}

	public ProductDTO(Product product) {
		super();
		this.product = product;
		this.quantity = 1;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
