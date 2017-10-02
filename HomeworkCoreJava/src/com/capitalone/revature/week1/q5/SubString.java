// Write a substring method that accepts a string str and an integer idx and
// returns the substring contained between 0 and idx-1 inclusive.

package com.capitalone.revature.week1.q5;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {

		// Read user input string and index value
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a String");
		String str = scan.nextLine();

		System.out.println("Enter a index value within String size");
		int idx = scan.nextInt();

		if (idx > str.length()) {
			System.out.println("Index value entered is more than the input string size");
		} else {

			// convert user input string into character array
			char[] inputString = str.toCharArray();

			// print the substring between index zero and index-1
			for (int i = 0; i < idx; i++) {
				System.out.print(inputString[i]);
			}
		}
		scan.close();
	}
}
