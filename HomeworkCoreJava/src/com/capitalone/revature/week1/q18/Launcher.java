//Create Concrete class inheriting three abstract classes and perform one of the three user requested actions

package com.capitalone.revature.week1.q18;

import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) {

		Concrete concrete = new Concrete();

		// Check which operation user wants to perform
		System.out.println("Choose the operation: \n");
		System.out.println("1. To check if there are any uppercase characters in the input string");
		System.out.println("2. To convert input string into Upper Case");
		System.out.println("3. Convert a String to an Integer and add 10 to it \n");

		// Accept user Input
		Scanner scan = new Scanner(System.in);

		// Perform user requested operation
		if (scan.hasNextInt()) {
			switch (scan.nextInt()) {
			case 1:
				// Checks if there is any upper case character in the input
				// string

				System.out.println("Enter a String with a combination of Lower and Upper Case");

				Scanner scanString = new Scanner(System.in);
				concrete.checkUpperCase(scanString.nextLine());
				scanString.close();

				break;

			case 2:
				// Converts the input string into upper case

				System.out.println("Enter a Character (a-z) to convert to Upper Case");
				Scanner scanLowerCaseString = new Scanner(System.in);
				concrete.lowerToUpperCase(scanLowerCaseString.nextLine());
				scanLowerCaseString.close();

				break;

			case 3:
				// Converts input string into integer and adds 10

				System.out.println("Enter a number to add to 10");
				Scanner scanIntegerString = new Scanner(System.in);
				concrete.convertToInteger(scanIntegerString.nextLine());
				scanIntegerString.close();

				break;

			default:
				System.out.println("You chose a wrong option!!!");
				break;
			}
		}
		scan.close();
	}
}