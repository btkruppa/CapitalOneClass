
public class SubClass extends SuperClass {

	@Override
	boolean checkUpper(String parm) {
		
		// Below statement checks to see if the lower case conversion of passed parameter = 
		// the converted to Lower case version of passed parameter
		// If they do not equal that means string contains at least 1 Upper case character
		boolean hasUpper = !parm.equals(parm.toLowerCase());
		
		// Return the result of previous statement
		return hasUpper;
	}

	@Override
	String toUpper(String parm) {
		
		// Simply return the parameter as converted upper case string
		return parm.toUpperCase();
	}

	@Override
	void toInteger(String parm) {
		
		// Convert the String parameter to an Integer.  Then add 10 and output result
		int theInt = Integer.parseInt(parm);
		theInt = theInt + 10;
		System.out.println(theInt);
		
	}

}
