package question18;

public class concreteClass extends abstractClass {

	// public static void main(String[] args) {

	// String uppCase = "tesTing";
	// getUppercaseChar(uppCase);
	//
	// }

	char ch;
	boolean foundUpperCase = false;

	@Override
	public boolean getUppercaseChar(String strInput) {
		for (int i = 0; i < strInput.length(); i++) {
			ch = strInput.charAt(i);
			if (Character.isUpperCase(ch)) {
				foundUpperCase = true;
				break;
			}
		}
		return foundUpperCase;
	}

	@Override
	public String lowerToUppper(String strInput) {
		return strInput.toUpperCase();
	}

	char chInt;
	boolean foundInt;
	int x;

	@Override
	public int stringToInteger(String strNum) {
		for (int x = 0; x < strNum.length(); x++) {
			foundInt = false;
			chInt = strNum.charAt(x);
			if (Character.isDigit(chInt)) {
				foundInt = true;
			}
		}
		if (foundInt == true) {
			x = Integer.parseInt(strNum);
			x = x + 10;
		}
		return x;
	}

}
