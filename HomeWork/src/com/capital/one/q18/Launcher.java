package com.capital.one.q18;

public class Launcher {

	public static void main(String[] args) {
		
		StringHelperImpl str = new StringHelperImpl();
		String string = "Hello World";
		String string1 = "hekko";
		System.out.println("uppercase value is present ?? " + "\n" + "answer is ..." +str.upperCaseCheck(string));
		str.changeCase(string);
		str.convertStringToIntegerPlus10(string1);
		

	}

}
