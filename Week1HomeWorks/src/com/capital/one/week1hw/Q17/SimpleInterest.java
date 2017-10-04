package com.capital.one.week1hw.Q17;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Principal amount: ");
		float myPrincipal = scanner.nextFloat();
		System.out.println("Please enter interest rate: ");
		float myInterestRate = scanner.nextFloat();
		System.out.println("Please enter number of years: ");
		int year = scanner.nextInt();

		float myInterest = simpleInterestCalc(myPrincipal, myInterestRate, year);
		System.out.println("Simple Interest: " + myInterest);

	}

	public static float simpleInterestCalc(float principal, float interestRate, int year) {
		float interest = (principal * interestRate * year) / 100;
		return interest;

	}

}
