package com.capitalone.q18;

public class StringConvertion extends Conversion {

	@Override
	boolean chkForUppercase(String s) {
		//boolean isUpper = true;
		//String lowerCaseCompare = s.toLowerCase();

		//if (s.equals(lowerCaseCompare)) {
		//	isUpper = false;
		//}
		//return isUpper;
		   for (int i=0; i<s.length(); i++)
		    {
		        if (!Character.isUpperCase(s.charAt(i)))
		        {
		            return false;
		        }
		    }
		    return true;
	}

	@Override
	String convertForUppercase(String s) {
		return s.toUpperCase();
	}

	@Override
	int convertStrToIntPlus10(String s) {
		int convertStringAsInt = 0;
		try {
			convertStringAsInt = (Integer.valueOf(s) + 10);
			//System.out.println("Given string as an integer + 10 = " + convertStringAsInt);
		} catch (NumberFormatException n) {
			System.out.println("The number you entered as a string can not be converted to an integer.");
		}
		return convertStringAsInt;

	}

}
