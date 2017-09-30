package com.capitalone.revature.week1.q14;

import java.time.LocalDate;

public class SwitchCase {
	// demonstrate the switch case
	public static void main(String[] args) {
		switchCase(1);
		switchCase(2);
		switchCase(3);
	}

	private static void switchCase(int i) {

		int number = 10;
		String str = "I am learning Core Java";

		switch (i) {
		case 1:
			// Square Root of a number
			System.out.println("Square Root of " + number + " is ... " + Math.sqrt(number));
			break;
		case 2:
			// Today's Date
			System.out.println("Today's Date " + LocalDate.now());
			break;
		case 3:
			// Split and store in a String array
			String[] splitString = str.split(" ");
			System.out.println("String Array Length : " + splitString.length);
			break;
		default:
			System.out.println("Not matched to any Case elements");
		}
	}
}
