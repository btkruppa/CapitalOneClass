package q17;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		int principal;
		int rateOfInterest;
		int time;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		principal = scanner.nextInt();
		System.out.println("Enter Rate of Interest: ");
		rateOfInterest = scanner.nextInt();
		System.out.println("Enter time: ");
		time = scanner.nextInt();
		
		System.out.println("Interest Calculated: " +  (principal*rateOfInterest*time));
		scanner.close();
	}

}
