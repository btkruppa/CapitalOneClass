package com.capital.one.week1hw.Q6;

import java.util.Scanner;

public class VerifyEven {
	public static void main(String[] args) {
		int number;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number to check if it is even: ");
		number = input.nextInt();
	
		if ((number & 1) == 0) {								
			System.out.println(number + " is an even number");
		} else
			System.out.println(number + " is not an even number");
	}
}
