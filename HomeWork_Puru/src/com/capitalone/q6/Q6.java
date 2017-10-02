package com.capitalone.q6;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int num;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number to check even:: ");
		num = input.nextInt();
		System.out.println("Enter number::::" + num);

		if ((num & 1) == 0) {								// bitwise operator 
			System.out.println(num + " is Even number");
		} else
			System.out.println(num + " is not an even number");

	}

}
