package com.q03.string.reverse;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse");
		
		String str = sc.nextLine();
		
		System.out.print("Reverse String of " + str + " is: ");
		
		for (int i = str.length() -1; i >= 0; i--) {
			
			System.out.print(str.charAt(i));
			
		}
	}

}
