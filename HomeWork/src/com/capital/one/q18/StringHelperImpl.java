package com.capital.one.q18;

public class StringHelperImpl extends StringHelper {

	boolean upperCaseCheck(String arg) {

		boolean result = true;
		String lowerCaseString = arg.toLowerCase();
		if ((arg).equals(lowerCaseString)) {
			result = false;
		}
		return result;

	}

	void changeCase(String arg) {
		System.out.println("After changing to uppercase I look like this  " + arg.toUpperCase());

	}

	 void convertStringToIntegerPlus10(String arg) {
		
		
		try {
			System.out.println((Integer.valueOf(arg) + 10));
		} catch (Exception e) {
			System.out.println("Your entry is not valid :(");
		}
		
		
	}

}
