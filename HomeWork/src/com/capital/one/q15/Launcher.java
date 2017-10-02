package com.capital.one.q15;

public class Launcher {

	public static void main(String[] args) {
		int a = 20;
		int b = 15;

		MathFunctions math = new MathFunctions();
		System.out.println(math.add(a, b));
		System.out.println(math.subtraction(a, b));
		System.out.println(math.multiplication(a, b));
		System.out.println(math.division(a, b));
	}

}
