package com.capital.one.assigment14;

import java.sql.Time;
import java.time.LocalDate;

public class SwitchCase {
	

	public static void main(String[] args) {
		swlogic(1); // square root 
		swlogic(2); //date
		swlogic(3); // 
		swlogic(0);// no match
		
	}
	
	
	
	private static void swlogic(int a) {
		int a1 =10;
		String str = "I am learning Core Java";
		
		switch (a) {
		case 1:
			System.out.println("Square Root of a number " + Math.sqrt(a1));
			
			break;

		case 2:
			System.out.println("Local date " +LocalDate.now() );
			
			break;
			
		case 3:
			String[] splitString = str.split(" ");

			System.out.println("String Array Length : " + splitString.length);

			break;
			
		default:
			System.out.println("NO MATCH");
		}
		
	}

	

}
