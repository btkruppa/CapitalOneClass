package question_17;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("This tool helps you to calculate simple interest on the Principal");

		System.out.println("Please Enter Principal");
		float prinipal = scanner.nextFloat();

		System.out.println("Please Enter Time");
		float years = scanner.nextFloat();

		System.out.println("Please Enter Interest Rate");
		float rate = scanner.nextFloat();

		float interest = years * prinipal * rate;

		System.out.println("Your Simple Interest is " + interest);

	}
}
