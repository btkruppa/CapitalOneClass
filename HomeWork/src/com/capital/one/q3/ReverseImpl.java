package com.capital.one.q3;

public class ReverseImpl {

	public String reverseMe(String arg) {

		int len = arg.length();
		StringBuilder output = new StringBuilder();

		for (int i = len - 1; i >= 0; i--) {

			output.append(arg.charAt(i));

		}

		return output.toString();
	}
}
