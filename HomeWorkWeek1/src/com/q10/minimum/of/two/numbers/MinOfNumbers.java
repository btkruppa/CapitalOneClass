package com.q10.minimum.of.two.numbers;

import java.util.Scanner;

public class MinOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int n2 = sc.nextInt();

		int n = (n1 < n2) ? n1 : n2;

		System.out.println("Minimum number in " + n1 + " and " + n2 + " is: " + n);

	}

}
