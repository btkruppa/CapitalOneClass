package com.capital.one.classwork;

import java.io.Serializable;

public class CandyBar implements Serializable{

	private static final long serialVersionUID = 1989L;
	
	private String name = "TwixBar";
	private double price = 1.29;
	private transient int calories = 180;
	
	public CandyBar() {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	@Override
	public String toString() {
		return "CandyBar [name=" + name + ", price=" + price + ", calories=" + calories + "]";
	}


}
