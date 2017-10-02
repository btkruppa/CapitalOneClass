package Q17SimpleInt;

import java.util.Scanner;

public class SimpleInt {

	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle");
		int p = sc.nextInt();
		System.out.println("Enter Rate");
	     int r = sc.nextInt();
	     System.out.println("Enter Interest");
	     long i = sc.nextLong();
	     System.out.println("Calculating Simple Interest....");
	     System.out.println("Your Interest  :"+(p*r*i)*.01);
	}

	

}
