package com.shop.model;

import jakarta.persistence.Entity;


public class Size {
	
	private String name;
	
	private int quantity;

	public Size() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
