package com.capitalone.q5;

public class Q5 {

	public static String getSubstring(String str, int idx) {
		StringBuilder myString = new StringBuilder();
		int counter = 0;
		for (char element: str.toCharArray()) { 
			if (counter<idx) {                  
				myString.append(element);
			}
			counter++;                         
		}
		return myString.toString();  
	}

}

