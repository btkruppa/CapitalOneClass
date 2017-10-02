// Create an ArrayList which stores numbers from 1 to 100 and prints out all
// the prime numbers to the console

package com.capitalone.revature.week1.q9;

public class PrimeNumbersArray {

	public static void main(String[] args) {

		int numArray[] = new int[100];

		// Populating the Array
		for (int i = 1; i <= numArray.length; i++) {
			numArray[i - 1] = i;
		}
		System.out.println("Numbers added to Array : " + numArray.length);

		// Printing Prime Numbers between 1 and 100
		System.out.println("\nPrime numbers in Array: \n");

		int numberOfPrimeNumbers = 4;
		
		for (int i = 1; i < numArray.length; i++) {

			// Prime numbers less than 10
			if (numArray[i] == 2 || numArray[i] == 3 || numArray[i] == 5 || numArray[i] == 7) {
				System.out.print(numArray[i] + " ");
			} else {
				// Validate for remaining Prime numbers
				if (!(numArray[i] % 2 == 0) && !(numArray[i] % 3 == 0) && !(numArray[i] % 5 == 0)
						&& !(numArray[i] % 7 == 0)) {
					System.out.print(numArray[i] + " ");
					
					numberOfPrimeNumbers++;
				}
			}
		}
		System.out.println("\n\nTotal Number of Prime Numbers between 1 and 100 : " + numberOfPrimeNumbers);

	}
}