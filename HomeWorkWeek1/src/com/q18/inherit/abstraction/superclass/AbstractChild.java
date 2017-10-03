package com.q18.inherit.abstraction.superclass;

public class AbstractChild extends AbstractSuper {

	@Override
	boolean UpperCaseString(String str) {

		String strLower = str.toLowerCase();

		return (str.equals(strLower));

	}

	@Override
	String UpperCase(String str) {

		String strUpper = str.toUpperCase();

		return strUpper;
	}

	@Override
	void StringToInt(String str) {

		try {

			System.out.println("Integer of " + str + " is: " + Integer.parseInt(str) + 10);

		} catch (NumberFormatException e) {

			System.out.println("Entered a String which can not be converted to Integer");

		}

	}

}
