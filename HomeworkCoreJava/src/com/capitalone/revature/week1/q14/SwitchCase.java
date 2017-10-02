// Write a program that demonstrates the switch case

package com.capitalone.revature.week1.q14;

import java.time.LocalDate;

public class SwitchCase {

	public static void main(String[] args) {
		switchCase(1); // Execute the switchCase method with one of the valid
						// case values
		switchCase(2); // Execute the switchCase method with one of the valid
						// case values
		switchCase(3); // Execute the switchCase method with one of the valid
						// case values
		switchCase(0); // Execute the switchCase method with an invalid case
						// value to validate default functionality
	}

	private static void switchCase(int i) {

		int number = 10;
		String str = "I am learning Core Java";

		switch (i) {
		case 1:
			// Find a Square Root of a number using the Math class method

			System.out.println("Square Root of " + number + " is ... " + Math.sqrt(number));

			break;
		case 2:
			// Display Today's Date

			System.out.println("Today's Date " + LocalDate.now());

			break;
		case 3:
			// Split a String and store it in a String array

			String[] splitString = str.split(" ");

			System.out.println("String Array Length : " + splitString.length);

			break;
		default:
			System.out.println("Not matched to any Case elements");
		}
	}
}
