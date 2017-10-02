package com.capital.one.q14;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		System.out.println("Please enter" + "\n" + "   1 - to find square root of a number" + "\n"
				+ "   2 - to find today's date" + "\n" + "   3 - to split the string and store in array");
		Scanner scanner = new Scanner(System.in);
		int selection = scanner.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Enter a number to find square root");
			int num = scanner.nextInt();
			System.out.println(Math.sqrt(num));
			break;

		case 2:
			System.out.println(LocalDateTime.now());
			break;
		case 3:
			System.out.println("Enter a String to add in array");
			scanner.nextLine();
			String str = scanner.nextLine();
			String[] myArray = str.split(" ");
			for (String element : myArray) {
				System.out.println(element);
			}
			break;
		default:
			System.out.println("Your entry is not valid in this program");

		}
	}

}
