package com.q13.triagle.display;

import java.util.Scanner;

public class TriangleDisplay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to display Triangle");

		int i = sc.nextInt();

		for (int j = 0; j < i; j++) {
			for (int k = 0; k <= j; k++) {
				System.out.print(k%2 + " ");
			}
			System.out.println();
		}
		
	}

}
