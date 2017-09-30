//In Progress
package com.capitalone.revature.week1.q5;

import java.util.Scanner;

public class SubString {
	// Write a substring method that accepts a string str and an integer idx and
	// returns the substring contained between 0 and idx-1 inclusive.
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a String");
		String str = scan.nextLine();

		System.out.println("Enter a index value within String size");
		int idx = scan.nextInt();

		scan.close();
		
		retrieveSubString(str, idx);
	}

	private static void retrieveSubString(String str, int idx) {
		if (idx == str.length()){

		}
		
	}
}
