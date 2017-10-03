package com.q06.integer.even;

import java.util.Scanner;

public class evenInteger {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number to find even or odd: ");
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		integearEvenOdd(i);
	}

	private static void integearEvenOdd(int i) {
		// TODO Auto-generated method stub
		
		// System.out.println(i/2);
		
		if(i/2 * 2 == i) {
			
			System.out.println(i + " is an even number");
		} else
			
			System.out.println(i + " is an odd number");
		
	}

}
