package com.capitalone.revature.week1.q10;

import java.util.Scanner;

public class MinimumOfTwo {
	public static void main(String[] args) {

		// Reads user input from console

		Scanner scan = new Scanner(System.in);

		System.out.println("Etner two numbers in integer format");
		int first = scan.nextInt();
		int second = scan.nextInt();

		// Calculate the Minimum of Two input values

		int minimumOfTwo = first < second ? first : second;
		
		System.out.println(minimumOfTwo + " is the minimum of two");

		// Close the scanner object

		scan.close();
	}
}
