package com.capital.one.assigment10.ternary;

import java.util.Scanner;

public class TerrLogic {

	public static void main(String[] args) {

		System.out.println("Enter one numbers in integer format");
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		System.out.println("Enter another numbers in integer format");
		int b = scan.nextInt();

		int min = (a < b) ? a : b;
		System.out.println(min + " is the minimum of two");
		scan.close();
	}

}
