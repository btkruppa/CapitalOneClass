package q16;

import java.util.Scanner;

public class StringCharacters {

	public static void main(String[] args) {;
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = scanner.nextLine();
		System.out.println("Length of the String: " + str.length());
		scanner.close();
	}

}
