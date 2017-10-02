//Program to display the number of characters for a string input.  
//The string should be entered as a Command Line argument.

package com.capitalone.revature.week1.q16;

import java.util.Scanner;

public class CharacterCount {
	public static void main(String[] args) {

		// Read customer input
		System.out.println("Enter a String \n");
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();

		// Calculate number of characters
		System.out.println(inputString.length());
		scan.close();
	}
}
