package Q4;

public class Factorial {

	//Set up main and call factorial method with parameter.  Using 5 in this case
	//Store result from function call into variable and print it
	public static void main(String[] args) {
		int factorial = factorial(5);
		System.out.println("factorial is: " + factorial);
	}

	public static int factorial(int parm) {
		
		int fact = 1;
		// Find factorial for the passed parameter and return to main
		for (int i = 1; i <= parm; i++) {
			fact = fact * i;
		}
		
		return fact;
	}

}
