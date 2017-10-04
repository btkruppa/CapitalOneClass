package com.capital.one.week1hw.Q16;

import java.util.Scanner;

public class CharacterLength {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string to get length: ");
		String myString = scanner.nextLine();
		System.out.println("Length of the tring is: " + myString.length());
		scanner.close();

	}

}
