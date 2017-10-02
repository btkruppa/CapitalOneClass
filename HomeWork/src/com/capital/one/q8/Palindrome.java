package com.capital.one.q8;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
		List<String> namelist = new ArrayList<>();

		namelist.add("kayak");
		namelist.add("scooter");
		namelist.add("madam");
		namelist.add("mom");
		namelist.add("book");
		for (String element : namelist) {

			StringBuilder sb = new StringBuilder(element);
			String s2 = sb.reverse().toString();
			if (element.equals(s2)) {
				System.out.println(element);
			}
		}

	}

}
