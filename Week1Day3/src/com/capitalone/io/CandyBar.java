package com.capitalone.io;

import java.io.Serializable;

public class CandyBar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3747513396107929419L;
	
	
	private String name;
	@Override
	public String toString() {
		return "CandyBar [name=" + name + ", price=" + price + "]";
	}

	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public CandyBar(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public CandyBar() {
		super();
		// TODO Auto-generated constructor stub
	}

}
