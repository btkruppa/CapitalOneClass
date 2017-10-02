package com.capital.one.assigment16;

import java.util.Scanner;

public class Count {
	
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scan = new  Scanner(System.in);
		String IS = scan.nextLine();
		
		
		System.out.println(IS.length());
		scan.close();
		System.out.println("Thank You");
	}

}
