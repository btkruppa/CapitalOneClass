package com.capitalone.q17;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {

		// creating scanner to accept principle, rate and time input form user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome in Java program to calculate Simple interest");

		System.out.println("Please enter principle amount :");
		float amount = scanner.nextFloat();

		System.out.println("Enter time in years : ");
		float time = scanner.nextFloat();

		System.out.println("Enter rate annually : ");
		float rate = scanner.nextFloat();

		float interest = simpleInterest(amount, rate, time);

		System.out.println("Simple interested calculation is : " + interest);
	}

	public static float simpleInterest(float principle, float rate, float time) {
		float interest = (principle * rate * time) / 100;
		return interest;
	}
}
