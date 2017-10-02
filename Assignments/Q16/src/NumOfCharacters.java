import java.util.Scanner;

public class NumOfCharacters {

	public static void main(String[] args) {
		
		// Declare new String Object called myString
		String myString = new String();
		
		//Store the String input into myString
		for (String x : args) {
			myString = x;
		}
		//Sysout the length (i.e. number of characters) for command line argument stored in myString
		System.out.println("xx: " + myString.length());
		
	}
}