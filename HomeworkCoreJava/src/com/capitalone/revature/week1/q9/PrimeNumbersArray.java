//In progress
package com.capitalone.revature.week1.q9;

public class PrimeNumbersArray {

	// Create an ArrayList which stores numbers from 1 to 100 and prints out all
	// the prime numbers to the console

	public static void main(String[] args) {

		int numArray[] = new int[100];

		// Populating the Array
		for (int i = 1; i <= numArray.length; i++) {
			numArray[i - 1] = i;
			System.out.println("Added " + i + " to Array index " + (i - 1));
		}

		// Printing Prime Numbers up to 100
		System.out.println("\nPrime numbers from Array\n");

		boolean isPrimeNumber = false;
		for (int arrayElement : numArray) {
			for (int j = 2; j <= 10; j++) {
				if (numArray[arrayElement - 1] % j < 0) {
					isPrimeNumber = true;
				}
			}

			if (isPrimeNumber == true) {
				System.out.println(arrayElement + " is a Prime Number.");
			} else {
				isPrimeNumber = true;
			}
		}
	}
}