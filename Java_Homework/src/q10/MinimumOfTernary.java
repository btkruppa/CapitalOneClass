package q10;

import java.util.Scanner;


public class MinimumOfTernary {
	static int one;
	static int two;
	static int ternValue;
	
	public static void main(String[] args) {
		System.out.println("Enter First Integer: \r");
		Scanner scanner = new Scanner(System.in);
		one = scanner.nextInt();
		System.out.println("Enter Second Integer: \r");
		two = scanner.nextInt();
		System.out.println("Min value: " + ternValue(one, two));
		scanner.close();
		
	}
	
	public static int ternValue(int one, int two) {
		return ((one < two) ? one : two);
	}

}
