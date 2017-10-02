package question_18;

public class Stringimpl extends Stringscase {

	boolean upperCase(String arg) {

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

	int convertStringToInteger(String arg) {
		int value;
		return	Integer.parseInt((Integer.valueOf(arg) + 10));
		 
		
	}

	
	
}

