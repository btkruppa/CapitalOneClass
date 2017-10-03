package com.q18.inherit.abstraction.superclass;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {

		AbstractChild ac = new AbstractChild();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");

		String str1 = sc.nextLine();

		boolean lowerCase = ac.UpperCaseString(str1);

		if (lowerCase == true)
			System.out.println(str1 + " has all Lower Case characters");
		else
			System.out.println(str1 + " has Uppercase characters");

		System.out.println("Upper Case of " + str1 + " is: " + ac.UpperCase(str1));

		ac.StringToInt(str1);
	}

}
