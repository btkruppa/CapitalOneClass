package com.capitalone.q18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		StringConvertion sc = new StringConvertion();

		Scanner s = new Scanner(System.in);
		String input_str;
		boolean result;
		String result_str;
		int result_add;

		int option;
		System.out.println("Select the below options which you would like :");
		System.out.println("1. String to check uppercase character.");
		System.out.println("2. String to convert uppercase.");
		System.out.println("3. Convert to integer and add 10.");
		System.out.println("4. QUIT");
		System.out.println("----------------------------------");

		option = s.nextInt();

		if (option < 1 || option > 4) {
			System.out.println("Invalid Selection.  Try again.");
			System.exit(0);
		}

		switch (option) {
		case 1:
			System.out.println("Enter String to check uppercase character:");
			s.nextLine();
			input_str = s.nextLine();
			result = sc.chkForUppercase(input_str);
			System.out.println("String " + input_str + " has uppercase character");
			break;
		case 2:
			System.out.println("Enter String to convert uppercase character:");
			s.nextLine();
			input_str = s.nextLine();
			result_str = sc.convertForUppercase(input_str);
			System.out.println("String " + input_str + " converted to uppercase characters : " + result_str);
			break;
		case 3:
			System.out.println("Enter string to convert int and add 10:");
			s.nextLine();
			input_str = s.nextLine();
			result_add = sc.convertStrToIntPlus10(input_str);
			System.out.println("The converted string " + input_str + " and with addition of 10 is :" + result_add);
			break;
		case 4:
			System.out.println("Thank you and application exists successfully !");
			break;

		}
		s.close();
	}

}
