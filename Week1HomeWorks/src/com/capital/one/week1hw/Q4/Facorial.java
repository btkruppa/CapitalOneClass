package com.capital.one.week1hw.Q4;

public class Facorial {
	public static void main(String[] args) {
		int n = 5;
		int factorialOutput = 1;
		for (int i = n; i > 0; i--) {
			factorialOutput = factorialOutput * i;
		}
		System.out.println("Factorial of " + n + " is: " + factorialOutput);
	}
}
