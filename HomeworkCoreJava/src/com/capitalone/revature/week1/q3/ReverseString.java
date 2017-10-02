// Reverse a string without using a temporary variable. Do not use reverse()
// in the StringBuffer or StringBuilder APIs.

package com.capitalone.revature.week1.q3;

public class ReverseString {

	public static void main(String[] args) {

		// Take a sample string to print in reverse order
		String originalString = "abcdefghijklmnopqrstuvwxyz";

		// Print the string value before it is reverted
		System.out.println("Original String: " + originalString);
		System.out.print("Reverse String: ");

		// Loop starting with the length of the original string and repeat till
		// it is 0
		for (int l = originalString.length(); l > 0; l--) {
			// print the string in reverse order
			System.out.print(originalString.substring(l - 1, l));
		}
	}
}
