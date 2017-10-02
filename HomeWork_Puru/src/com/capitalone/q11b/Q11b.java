package com.capitalone.q11b;

import com.capitalone.q11a.Q11a;

public class Q11b {

	public static float f1;
	public static float f2;
	
	public static void main(String[] args) {
		
		Q11a q11 = new Q11a(10.5f,9.5f);
		
		System.out.println("Float one value is: "+ q11.getF1());
		System.out.println("Float two value is: "+ q11.getF2());
		
		System.out.println("Multiplication of two float values:: "+ q11.multiply());
		
		Q11a q1 = new Q11a(5.5f,5.5f);
		
		System.out.println("Float one value is: "+ q1.getF1());
		System.out.println("Float two value is: "+ q1.getF2());
		
		System.out.println("Multiplication of two float values:: "+ q1.add());
		

	}

}
