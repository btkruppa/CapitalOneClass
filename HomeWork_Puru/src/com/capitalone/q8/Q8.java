package com.capitalone.q8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8 {

	public static void main(String[] args) {
		List<String> strlist = new ArrayList<String>(Arrays.asList("karan", "madam", "tom", "civic", "radar", "sexes",
				"jimmy", "kayak", "john", "refer", "billy", "did"));
		List<String> palidromelist = new ArrayList<String>();

		for (int i = 0; i < strlist.size(); i++) {
			String liststr = strlist.get(i);

			if (liststr.equals(new StringBuilder(liststr).reverse().toString()) == true) {
				palidromelist.add(liststr);
			}

		}
		System.out.println("Full List : " + strlist);
		System.out.println("Palindrome List : " + palidromelist);

	}

}
