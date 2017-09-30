package com.capitalone.revature.week1.q6;

import java.util.Scanner;

public class IsEven {

	// Write a program to determine if an integer is even without using the
	// modulus (%) operator.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an integer whole number");

		int inputValue = scan.nextInt();
		int calculatedQuotient = inputValue / 2;
		int calculatedProduct = calculatedQuotient * 2;
		int isEven = inputValue - calculatedProduct;

		if (isEven == 0) {
			System.out.println(inputValue + " is Even Number.");
		} else {
			System.out.println(inputValue + " is not an Even Number.");
		}

		scan.close();
	}
}
