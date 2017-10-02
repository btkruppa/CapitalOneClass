// Write a program to determine if an integer is even without using the modulus (%) operator.

package com.capitalone.revature.week1.q6;

import java.util.Scanner;

public class IsEven {

	public static void main(String[] args) {

		// Read user input

		System.out.println("Enter an integer whole number");
		Scanner scan = new Scanner(System.in);

		// Calculate Quotient and Product values to verify whether the input
		// number is Even or Not
		int inputValue = scan.nextInt();
		int calculatedQuotient = inputValue / 2;
		int calculatedProduct = calculatedQuotient * 2;
		int isEven = inputValue - calculatedProduct;

		// Verify if Even or Not and print the outcome
		// if (isEven.equals(0)) {
		if (isEven == 0) {
			System.out.println(inputValue + " is Even Number.");
		} else {
			System.out.println(inputValue + " is not an Even Number.");
		}

		scan.close(); // Close the scanner input stream
	}
}
