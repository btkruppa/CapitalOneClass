package com.q13.triagle.display;

import java.util.Scanner;

public class TriangleDisplay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to display Triangle");

		int i = sc.nextInt();

		int counter = 0;

		for (int j = 0; j < i; j++) {
			for (int k = 0; k <= j; k++) {
				
				System.out.print(counter + " ");

				if (counter == 0)
					counter = counter + 1;
				else
					counter = 0;
			}
			System.out.println();
		}

	}

}
