package com.capitalone.revature.week1.q12;

public class EvenNumbers {
	// Write a program to store numbers from 1 to 100 in an array. Print out all
	// the even numbers from the array using enhanced FOR loop.
	public static void main(String[] args) {

		int numArray[] = new int[100];

		// Populating the Array
		for (int i = 1; i <= numArray.length; i++) {
			numArray[i - 1] = i;
			System.out.println("Added " + i + " to Array index " + (i - 1));
		}

		// Printing Even Numbers retrieved from numArray
		System.out.println("\nEven numbers from Array\n");

		for (int arrayElement : numArray) {
			if (numArray[arrayElement - 1] % 2 == 0) {
				System.out.print(numArray[arrayElement - 1] + " ");
			}
		}
	}
}
