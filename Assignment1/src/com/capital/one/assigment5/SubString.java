package com.capital.one.assigment5;

import java.util.Scanner;

public class SubString {
	
	public static void main(String[] args) {

		// Read user input string and index value
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a String");
		String str = scan.nextLine();

		System.out.println("Please enter a index value within string size");
		int idx = scan.nextInt();

		if (idx > str.length()) {
			System.out.println("value entered is more than the string size");
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

