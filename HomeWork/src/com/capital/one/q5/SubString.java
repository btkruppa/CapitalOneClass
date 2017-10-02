package com.capital.one.q5;

public class SubString {

	public static void main(String[] args) {
		String str = "HelloWorld";
		int idx = 1;
		subString(str, idx);

	}

	public static void subString(String str, int idx) {

		String otherString = new String();
		for (int i = 0; i <= idx; i++) {

			otherString = otherString + str.charAt(i);

		}
		System.out.println(otherString);
	}

}
//This solution is for writing a substring method that accepts string and index. Do not using existing methods.