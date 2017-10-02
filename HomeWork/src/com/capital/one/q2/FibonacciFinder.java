package com.capital.one.q2;

public class FibonacciFinder {

	public void fibonacciCalc(int arg) {

		int[] myArray = new int[arg];
		int x = 0;
		int y = 1;
		int z = 0;

		myArray[0] = x;
		myArray[1] = y;

		for (int i = 0; i < myArray.length - 2; i++) {

			z = x + y;
			x = y;
			y = z;

			myArray[i + 2] = z;

		}

		for (int element : myArray) {
			System.out.println(element);
		}

	}

}
