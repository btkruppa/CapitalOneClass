package com.q15.add.sub.mult.div;

public class Calculator implements Methods {

	@Override
	public int add(int a, int b, int...n) {

		int addition = a + b;
		for(int i : n)
			addition = addition + i;
		System.out.println("Addition of all numbers is: " + addition);
		return addition;

	}

	@Override
	public int sub(int a, int b) {

		int substraction = a - b;
		System.out.println("Substraction of " + a + " and " + b + " is: " + substraction);
		return substraction;

	}

	@Override
	public void multiplication(int a, int b) {

		double multiplication = a * b;
		System.out.println("Multiplication of " + a + " and " + b + " is: " + multiplication);

	}

	@Override
	public float div(int a, int b) {

		float division = a / b;
		System.out.println("Substraction of " + a + " and " + b + " is: " + division);
		return division;

	}

}
