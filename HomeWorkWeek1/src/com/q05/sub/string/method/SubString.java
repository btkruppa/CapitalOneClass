package com.q05.sub.string.method;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");

		String str1 = sc.nextLine();

		System.out.println("Enter a number to get the subString");

		int i = sc.nextInt();

		String subString = subString(str1, i);
		
		System.out.println(subString);

	}

	public static String subString(String str, int idx) {
		
		String temp = "";

		for (int i = 0; i < idx; i++) {
			
	//		System.out.print(str.charAt(i));
			
			temp = temp + str.charAt(i);
		}
		
		return temp;

	}

}
