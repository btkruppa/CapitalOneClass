// Write a program to store numbers from 1 to 100 in an array. Print out all
// the even numbers from the array using enhanced FOR loop.

package com.capitalone.revature.week1.q12;

public class EvenNumbers {
	public static void main(String[] args) {

		int numArray[] = new int[100]; // Create an array of size 100 integers

		// Populate numArray with integers
		for (int i = 1; i <= numArray.length; i++) {
			numArray[i - 1] = i;
			System.out.println("Added " + i + " to Array index " + (i - 1));
		}

		// Retrieve and print the Even Numbers from numArray
		System.out.println("\nEven numbers from Array\n");

		for (int arrayElement : numArray) {
			if (numArray[arrayElement - 1] % 2 == 0) {
				System.out.print(numArray[arrayElement - 1] + " ");
			}
		}
	}
}
