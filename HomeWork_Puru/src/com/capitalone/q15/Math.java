package com.capitalone.q15;

public class Math implements Q15Interface {

	@Override
	public int addition(int a, int b) {
		int c = a + b;
		return c;

	}

	@Override
	public int substraction(int a, int b) {
		int c = a - b;
		return c;

	}

	@Override
	public int multiplication(int a, int b) {
		int c = a * b;
		return c;

	}

	@Override
	public int division(int a, int b) {
		int c = a / b;
		return c;

	}

}
