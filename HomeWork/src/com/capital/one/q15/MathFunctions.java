package com.capital.one.q15;

public class MathFunctions implements MathInterface {

	@Override
	public int add(int a, int b) {
		return a + b;

	}

	@Override
	public int subtraction(int a, int b) {
		return a - b;

	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;

	}

	@Override
	public int division(int a, int b) {

		return a / b;

	}

}