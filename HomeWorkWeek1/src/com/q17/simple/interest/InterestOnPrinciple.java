package com.q17.simple.interest;

import java.util.Scanner;

public class InterestOnPrinciple {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount: ");
		double principle = sc.nextDouble();
		System.out.println("Enter the Rate of Interest: ");
		float rate = sc.nextFloat();
		System.out.println("Enter the time in number of months: ");
		int time = sc.nextInt();
		
		double Interest = principle * rate * time / 100;
		
		System.out.println("Your total Interest for " + time + " Months period is: " + Interest);
		
		sc.close();
		
	}

}
