import java.util.Date;

public class Switch {

	public static void main(String[] args) {
		
		//number for the Square Root
		int number = 49;
		
		//case statement parameter
		int caseParm = 3;
		
		switch (caseParm) {
		
		case 1: 
			System.out.println((int)(Math.sqrt(number)));
			break;
		case 2:
			Date myDate = new Date();
			System.out.println(myDate);
			break;
		case 3:
			String myString = "I am learning Core Java";
			String[] stringArray = new String[2];
			stringArray[0] = myString.substring(0, 13);
			stringArray[1] = myString.substring(14);
			
			System.out.println("part1: " + stringArray[0]);
			System.out.println("part2: " + stringArray[1]);
		}
	}
}
