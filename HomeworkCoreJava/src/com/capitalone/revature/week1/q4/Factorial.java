package com.capitalone.revature.week1.q4;

import java.util.Scanner;

public class Factorial {
	// Write a program to compute N factorial
	public static void main(String[] args) {
		long factorial = 1l;

		// Read user input
		System.out.println("Enter a whole number between 1 and 20 ");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();

		if (N > 0 && N < 21) {
			System.out.print("Factorial for " + N + ": ");

			for (int number = 1; number <= N; number++) {
				factorial = factorial * number;  //calculate Factorial for the user input number
			}

			System.out.print(factorial);
		} else {
			System.out.println("Enter a value between 1 and 20");
		}
	}
}
