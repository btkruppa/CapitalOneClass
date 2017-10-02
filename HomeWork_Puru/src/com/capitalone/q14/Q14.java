package com.capitalone.q14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Logic l = new Logic();

		Scanner s = new Scanner(System.in);
		double sq_num = 0;
		double sq_input = 0;
		String input_str;
		List<String> parse_str = new ArrayList<String>();

		int option;
		System.out.println("Select the below options which you would like :");
		System.out.println("1. Find the square root of a number.");
		System.out.println("2. Display today's date.");
		System.out.println("3. Split a string into all of it's words, store to an array and print the array.");
		System.out.println("4. QUIT");
		System.out.println("----------------------------------");

		option = s.nextInt();

		if (option < 1 || option > 4) 
		{
			System.out.println("Invalid Selection.  Try again.");
			System.exit(0);
		}

		switch (option) {
		case 1:
			System.out.println("Enter number to find the square:");
			sq_input = s.nextDouble();
			sq_num = l.findSquare(sq_input);
			System.out.println("The square root of " + sq_input + " = " + sq_num);
			break;
		case 2:
			System.out.println("Today's date is " + l.currentDate().toString());
			break;
		case 3:
			System.out.println("Enter a sentence that will be stored as an array of strings and print:");
			input_str = s.nextLine();
			parse_str = l.splitstr(input_str);
			System.out.println("The strored string is :");
			System.out.println(parse_str);
		case 4:
			System.out.println("Thank you and application exists successfully !");
			break;

		}
		s.close();
	}

}
