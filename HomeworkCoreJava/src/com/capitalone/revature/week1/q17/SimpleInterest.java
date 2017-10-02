// Read user input using Scanner Class and Calculate Simple Interest on Principal, rate of Interest 
// and number of years provided by the user.

package com.capitalone.revature.week1.q17;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// Read User Input
		System.out.println("Simple Interest Calculator");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Principal Amount ");
		int principal = scan.nextInt();

		System.out.println("Enter Rate of Interest ");
		float rateInterest = scan.nextFloat();

		System.out.println("Enter Time in months ");
		int timeInMonths = scan.nextInt();

		// Calculate simpleInterest for the user supplied input
		float simpleInterest = principal * rateInterest * timeInMonths;

		scan.close();

		// Display the calculated simple interest
		System.out.println("Calculated Simple Interest: " + simpleInterest);

	}
}
