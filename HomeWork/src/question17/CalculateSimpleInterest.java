package question17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateSimpleInterest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter Principal amount");
		double principal = scan.nextDouble();

		System.out.println("Enter rate of interest");
		float rateOfInterest = scan.nextFloat();
		rateOfInterest = rateOfInterest/100;
		
		System.out.println("Enter number of years");
		int numberOfYears = scan.nextInt();

		DecimalFormat df = new DecimalFormat("#.##");
		double Interest;
		Interest = principal*rateOfInterest*numberOfYears;
		System.out.println(df.format(Interest));
	}

}
