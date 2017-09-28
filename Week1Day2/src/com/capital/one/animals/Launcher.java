package com.capital.one.animals;

public class Launcher {
	private static AnimalCareCenter careCenter = new AnimalCareCenter();
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		careCenter.feedAnimals(d);
		
		d.bark();
		
	}
}
