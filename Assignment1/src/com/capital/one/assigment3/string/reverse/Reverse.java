package com.capital.one.assigment3.string.reverse;

public class Reverse {

	static String s = "Hello World";

	public static void main(String[] args) {
		for (int i = 0; i < s.length(); i++) {
			s = s.substring(1, s.length() - i) + s.charAt(0) + s.substring(s.length() - i);
		}
		System.out.println(s);
	}

}
