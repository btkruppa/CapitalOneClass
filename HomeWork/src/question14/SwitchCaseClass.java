package question14;

import java.time.LocalDateTime;

public class SwitchCaseClass {

	public static void main(String[] args) {
		
		
		int newString = 1;

		
		switch(newString){
		case 1:
			System.out.println(Math.sqrt(25));
			break;
		case 2:
			System.out.println(LocalDateTime.now());
			break;
		case 3:
			String str = "I am learning Core java";
			String str1[] = str.split(" ");
			for(String str2: str1){
			System.out.println(str2);	
			}
			break;
		}

		
		

	}

}
