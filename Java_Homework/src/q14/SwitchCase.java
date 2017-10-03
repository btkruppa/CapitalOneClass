package q14;

import java.util.Date;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("Enter the option 1 for Square Root, option 2 for Today's Date, option 3 for String and enter any other option to exit: ");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		switch (i) {
		case 1:
			{
				double number = 8;
				double sqroot = Math.sqrt(number);
				System.out.println("square root: " + sqroot);
				
			}
			break;
		case 2:
			Date date = new Date();
			System.out.println("Todays Date: " + date);
			break;
			
		case 3:
			String str = "I am learning Core Java";
			String[] splitStr = str.split("");
			System.out.print("String Split: ");
			for (int j = 0; j < splitStr.length; j++) {
				System.out.print(splitStr[j] + ",");
			}
			
			break;
			
			
		default:
			System.out.println("Exit: ");
			
		}
		scanner.close();

	}

}
