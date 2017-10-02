import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		String principal = myScan.nextLine();
		System.out.println("Enter Interest Rate: ");
		String interest = myScan.nextLine();
		System.out.println("Enter Time Period:");
		String time = myScan.nextLine();
		
		double myPrincipal = Double.parseDouble(principal);
		double myInterest = Double.parseDouble(interest);
		double myTime = Double.parseDouble(time);
		
		Interest myTotal = new Interest(myInterest,myPrincipal,myTime);
		
		System.out.println("Your total interest is: " + myTotal.getTotal());
		
	}
}
