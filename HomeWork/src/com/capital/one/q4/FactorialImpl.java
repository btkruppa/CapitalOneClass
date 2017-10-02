package com.capital.one.q4;

public class FactorialImpl {

	public int factorial(int arg) {

		int z = 1;
		for (int i = 1; i <= arg; i++) {

			z = z * i;

		}
		return z;

	}

}
