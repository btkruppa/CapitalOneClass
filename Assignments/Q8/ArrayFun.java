package Q8;

import java.util.ArrayList;
import java.util.List;

public class ArrayFun {

	public static void main(String[] args) {

		// Set up the Array Lists
		List<String> fullList = new ArrayList<String>();
		List<String> onlyPalindromes = new ArrayList<String>();

		// Add Strings to ArrayList of Strings for the Full List
		fullList.add("karan");
		fullList.add("madam");
		fullList.add("tom");
		fullList.add("civic");
		fullList.add("radar");
		fullList.add("sexes");
		fullList.add("jimmy");
		fullList.add("kayak");
		fullList.add("john");
		fullList.add("refer");
		fullList.add("billy");
		fullList.add("did");

		// Sysout the Full List
		System.out.println("Full List is: ");
		System.out.println(fullList);

		// Loop through the Full list and use StringBuilder reverse method to check for
		// palindrome
		// Store in onlyPalindrome Array List if reverse of string equals string
		for (String whatever : fullList) {
			if (whatever.equals(new StringBuilder(whatever).reverse().toString())) {

				onlyPalindromes.add(whatever);
			}
		}
		System.out.println("Only the Palindromes");
		System.out.println(onlyPalindromes);

	}
}
