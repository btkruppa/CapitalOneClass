package com.capital.one.q3;

public class ReverseStringLauncher {

	public static void main(String[] args) {
		ReverseImpl reverse = new ReverseImpl();

		String homework = "hello world";

		System.out.println(reverse.reverseMe(homework));

	}

}

// **** Solution for - Reverse String without using temp variable. Do not use reverse() ***