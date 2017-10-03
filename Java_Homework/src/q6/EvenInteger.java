package q6;

import java.util.Scanner;

public class EvenInteger {

	public static void main(String[] args) {
		
		System.out.println("Enter Integer Number: \r");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if( (n/2) * 2 == n) {
			System.out.println("Given number is Even Number");
		}else {
			System.out.println("Given number is Odd Number");
		}
		scanner.close();
		

	}

}
