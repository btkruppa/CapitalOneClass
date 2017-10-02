package com.capital.one.assigment17;

import java.util.Scanner;

public class CalculatorInterest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Principal Amount ");
		int p = sc.nextInt();

		System.out.println("Please Enter Rate of Interest ");
		float r = sc.nextFloat();

		System.out.println("Please Enter Time in months ");
		int t = sc.nextInt();

		float si = p * r * t;

		sc.close();
		
		System.out.println("Simple Interest: " + si);
		System.out.println("Thanks");
		



	}

}
