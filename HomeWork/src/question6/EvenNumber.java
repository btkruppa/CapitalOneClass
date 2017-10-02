package question6;
//import java.util.Arrays;
//import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		//int[] x = {0,2,4,6,8};
		//double[] y = {1,3,5,7,9};
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//				
//		int userInput = Integer.valueOf(scan.nextLine());
//		
//		for(int i =0; i<x.length; i++){
//		if(x[i] == userInput){
//			System.out.println("Integer is an even number");
//		}else {
//			System.out.println("Integer is an odd number");
//		}
//		
//		System.out.println(userInput);
//		}


//--------------------------------------------------------------------		
		int inputN = 578998974;
		int lastDigit;
		lastDigit = inputN/10;
		lastDigit = inputN - lastDigit * 10;
		//System.out.println(lastDigit);
		
		int[] x = {0,2,4,6,8};
		
		boolean foundEven = false;
		for(int i =0; i<x.length; i++){			
		if(x[i] == lastDigit){
			foundEven = true;
			break;
		}		
	}
		if(foundEven == true)
			System.out.println("Integer is an even number");		
			else
				System.out.println("Integer is an odd number");
		}
	}

		
		
		

			
	

