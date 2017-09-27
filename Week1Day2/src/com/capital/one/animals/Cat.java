package com.capital.one.animals;

public class Cat extends Animal {
	private String name;
	private float weight;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, float weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	private void privateMethod() {

	}

	public String getName() {
		return name;
	}

	public float getWeight() {
		return weight;
	}

	@Override
	public boolean isAlive() {
		return isAlive;
	}

	@Override
	public void move() {
		System.out.println("cat walked");
	}

	@Override
	public void setAlive(boolean bool) {
		this.isAlive = bool;
		
	}

}
