// Concrete class inheriting three abstract classes

package com.capitalone.revature.week1.q18;

public class Concrete extends AbstractConcrete {
	String str;

	// Verifies if the user input has any Upper Case character
	public void checkUpperCase(String str) {
		String[] strArray = str.split("");
		for (int i = 0; i < strArray.length; i++) {

			if (Character.isUpperCase(str.charAt(i))) {
				System.out.println("Input string has an Upper Case Character");
				break;
			}
		}
	}

	// Converts user input into Upper Case
	public void lowerToUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}

	// Converts user input into Integer and adds 10
	public void convertToInteger(String str) {

		int result = Integer.parseInt(str);
		result = result + 10;
		System.out.println("result " + result);
	}
}
