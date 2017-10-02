package com.capitalone.calculation;

import java.util.Scanner;

public class CalculateMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalculateBean cb = new CalculateBean();		
		System.out.println("Please enter your first number");
		cb.setA(Integer.parseInt(scan.nextLine()));
		System.out.println("Please enter your second number");
		cb.setB(Integer.parseInt(scan.nextLine()));	
		cb.calculate();
		scan.close();
	}
}
