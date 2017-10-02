// Write a program to compute N factorial

package com.capitalone.revature.week1.q4;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		long factorial = 1l;

		// Read user input
		System.out.println("Enter a whole number between 1 and 20 ");

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // Read integer input from the console
		scan.close(); // Close the scanner

		// Confirm the input integer value and Calculate the factorial
		if (N > 0 && N < 21) {
			for (int number = 1; number <= N; number++) {
				factorial = factorial * number; // calculate Factorial for the
												// user input number
			}

			System.out.print("Factorial for " + N + ": " + factorial); // print
																		// the
																		// Calculated
																		// Value
		} else {
			System.out.println("Good Luck next time... You need to enter a whole number between 1 and 20");
		}
	}
}
