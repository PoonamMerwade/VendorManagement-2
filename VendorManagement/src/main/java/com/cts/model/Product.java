package com.cts.model;

import lombok.Data;

@Data
public class Product {

	private long productId;

	private String productName;

	private String productDescription;

	private float price;

	private Vendor vendor;

	public Product() {
		super();
	}
	public Product(long productId, String productName, String productDescription, float price, Vendor vendor2) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.vendor = vendor2;
	}

	public Product(long i, String string, String string2, float j) {
		this.productId = i;
		this.productName = string;
		this.productDescription = string2;
		this.price=j;
	}

}
