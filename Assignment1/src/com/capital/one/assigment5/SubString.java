package com.capital.one.assigment5;

import java.util.Scanner;

public class SubString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a String");
		String str = scan.nextLine();

		System.out.println("Enter a index value within String size");
		int idx = scan.nextInt();

		if (idx > str.length()) {
			 System.out.println("Index value entered is more than the input string size");
		} else {
			char[] inputString = str.toCharArray();
			for (int i = 0; i < idx; i++) {
				System.out.println(inputString[i]);
			}
		}
		scan.close();
	}

}

