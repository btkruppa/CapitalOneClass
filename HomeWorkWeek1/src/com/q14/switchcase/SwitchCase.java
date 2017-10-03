package com.q14.switchcase;
import java.time.LocalDate;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your options (1/2/3):");

		int i = s.nextInt();

		switch (i) {
		case 1:
			System.out.println("Enter a number to find square root: ");
			double sqrtNum = s.nextInt();
			System.out.println("Square Root of " + sqrtNum + " is: " + Math.sqrt(sqrtNum));
			break;

		case 2:
			System.out.println("Today's Date is: " + LocalDate.now());
			break;

		case 3:
			String str = "I am learning Core Java";
			String[] splitString = str.split(" ");
			for (String split : splitString)
				System.out.println(split);
			break;

		default:
			break;
		}
	}

}
