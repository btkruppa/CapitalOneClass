package com.q08.arraylist.palindromes;

import java.util.ArrayList;

public class Palindromes {

	public static void main(String[] args) {

		ArrayList<String> str1 = new ArrayList<String>();
		ArrayList<String> palindromes = new ArrayList<String>();

		str1.add("karan");
		str1.add("madam");
		str1.add("tom");
		str1.add("civic");
		str1.add("radar");
		str1.add("sexes");
		str1.add("jimmy");
		str1.add("kayak");
		str1.add("john");
		str1.add("refer");
		str1.add("billy");
		str1.add("did");

		for (String string : str1) {

			StringBuilder paliStr = new StringBuilder(string);

			if (paliStr.reverse().toString().equals(string)) {

				palindromes.add(string);
			}
		}
		
		for (int i=0; i<palindromes.size(); i++) {

		System.out.println(palindromes.get(i));
		
		}

	}

}
