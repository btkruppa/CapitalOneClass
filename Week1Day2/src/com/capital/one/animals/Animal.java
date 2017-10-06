package com.capital.one.animals;

public abstract class Animal implements Life {
	
	protected boolean isAlive;
	
	public abstract void move();
	
	public void feed() {
		System.out.println("animal fed");
	}	
}
