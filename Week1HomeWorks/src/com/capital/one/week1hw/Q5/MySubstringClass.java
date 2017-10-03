package com.capital.one.week1hw.Q5;

public class MySubstringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Capitalone";
		int idx = 7;
		System.out.println(mySubstring(str, idx));
	}

	public static String mySubstring(String str, int idx) {
		String newSubstring = new String();
		for (int i = 0; i <= idx - 1; i++) {
			newSubstring = newSubstring + str.charAt(i);
		}
		return newSubstring;
	}

}
