package q4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Enter the integer number to calculte factorial: \r");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int i = 1;
		int factorial = 1;

		for (i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorila of " + n + " is: " + factorial);
		scanner.close();

	}

}
