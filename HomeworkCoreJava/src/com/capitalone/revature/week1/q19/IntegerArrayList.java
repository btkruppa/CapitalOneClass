//Create an Array list of integers from 1 to 10 and remove prime numbers from the array

package com.capitalone.revature.week1.q19;

import java.util.ArrayList;

public class IntegerArrayList {
	public static void main(String[] args) {
		
		// Create an array list and add integers 1 to 10 to it
		ArrayList<Integer> integerArray = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			integerArray.add(i);
		}

		// Calculate the total of Even and Odd numbers in the array list
		int evenNumber = 0;
		int oddNumber = 0;
		
		System.out.print("Data in the Array : ");

		for (int i = 0; i < 10; i++) {
			System.out.print(integerArray.get(i) + " ");

			if (integerArray.get(i) % 2 == 0) {
				evenNumber = evenNumber + integerArray.get(i);
			} else {
				oddNumber = oddNumber + integerArray.get(i);
			}
		}

		System.out.println("\n\nTotal of all the Even Numbers : " + evenNumber);
		System.out.println("Total of all the Odd Numbers : " + oddNumber);

		// Remove the prime numbers from the array
		System.out.println("\nTotal Entries in the Array before removing the Prime Numbers : " + integerArray.size());

		// Remove if divisible by 2 or 3
		for (int i = 1; i < integerArray.size(); i++) {
			if ((integerArray.get(i) == 2) || integerArray.get(i) == 3) {
				integerArray.remove(i);
				i--;
			} else if (!(integerArray.get(i) % 2 == 0)) {
				if (!(integerArray.get(i) % 3 == 0)) {
					integerArray.remove(i);
					i--;
				}
			}
		}

		System.out.println("Total Entries in the Array after removing the Prime Numbers : " + integerArray.size());

		// Print the data in array after removing Prime Numbers
		System.out.print("\nNon Prime numbers remaining in the Array : ");

		for (int i = 0; i < integerArray.size(); i++) {
			System.out.print(integerArray.get(i) + " ");
		}
	}
}
