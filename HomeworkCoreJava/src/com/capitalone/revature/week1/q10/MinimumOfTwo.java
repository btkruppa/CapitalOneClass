// Find the minimum of two numbers using ternary operators

package com.capitalone.revature.week1.q10;

import java.util.Scanner;

public class MinimumOfTwo {
	public static void main(String[] args) {

		// Reads user input from console

		System.out.println("Etner two numbers in integer format");
		Scanner scan = new Scanner(System.in);

		int first = scan.nextInt();
		int second = scan.nextInt();

		// Calculate the Minimum of Two input values using ternary operators

		int minimumOfTwo = first < second ? first : second;

		// Print the calculated minimum of two integers
		System.out.println(minimumOfTwo + " is the minimum of two");

		scan.close(); // Close the scanner input stream
	}
}
