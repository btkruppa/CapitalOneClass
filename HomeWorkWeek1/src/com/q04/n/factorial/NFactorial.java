package com.q04.n.factorial;

import java.util.Scanner;

public class NFactorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n Value");
		
		int n = sc.nextInt();
		
		int j =1;
		
		for(int i=1; i<= n; i++) {
			
			j = i * j;
		}
		
		System.out.println(n + " factorial is " + j);
	}

}
