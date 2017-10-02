package question_14;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		System.out.println("Please Enter" + "\n" + " case 1 : square root of number" +"\n" +  " case 2 : display today's time" + "\n" + " case 3 : I am learning core java");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("print square root of number");
			int number = scanner.nextInt();
			System.out.println(Math.sqrt(number));
			break;
			
		case 2:
			System.out.println(LocalDateTime.now());
			
		case 3:
		 System.out.println("Enter a String to add in array");
		 Scanner scanner1 = new Scanner	(System.in);
		 String Str = scanner1.nextLine();
		 String[] myArray = Str.split(" ");
		 for (String element : myArray) {
             System.out.println(element);
               }
        break;
        
        default:
        	System.out.println("Your entry is not valid in this program");
		
		
		
	}
	
	}
}
