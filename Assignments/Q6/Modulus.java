package Q6;

public class Modulus {

	// Set up Main and pass number to modulus method
	public static void main(String[] args) {
		int theNumber = 5;
		modulus(theNumber);
	}

	// Accept parameter as a double
	private static String modulus(double parm) {

		//Divide parameter by 2
		parm = parm / 2;
		String returnVal;
		//System.out.println(parm);
		
		// If Parm passes as an integer that means there is no remainder from the divide by 2
		// and parm is even else it is odd.
		if (parm == (int) parm) {
			System.out.println("Is even");
			returnVal = "even";
		} else {
			System.out.println("Is odd");
			returnVal = "odd";
		}
		return returnVal;
	}
}
