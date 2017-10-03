package com.capital.one.assigment18;

import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) {

		Concrete concrete = new Concrete();

		System.out.println("Choose the operation:");
		System.out.println("1. To check if there are any uppercase characters in the input string");
		System.out.println("2. To convert input string into Upper Case");
		System.out.println("3. Convert a String to an Integer and add 10 to it \n");

		Scanner scan = new Scanner(System.in);

		if (scan.hasNextInt()) {
			switch (scan.nextInt()) {
			case 1:
			System.out.println("Enter a String with a combination of Lower and Upper Case");

				Scanner scanString = new Scanner(System.in);
				concrete.checkUpperCase(scanString.nextLine());
				scanString.close();

				break;

			case 2:

				System.out.println("Enter a Character (a-z) to convert to Upper Case");
				Scanner scanLowerCaseString = new Scanner(System.in);
				concrete.lowerToUpperCase(scanLowerCaseString.nextLine());
				scanLowerCaseString.close();

				break;

			case 3:

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
