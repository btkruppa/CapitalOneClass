package question_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
	
	 public static void main(String[] args) {
		 
//		String ReverseStr = "Sandhya"; // converting string to char array
//		
//		char[] myArr = ReverseStr.toCharArray();
//		
//		 for( int i = myArr.length-1; i>=0; i--){
//			 String myString = new String(myArr);
//			 
//			 System.out.println(myArr[i]);
		 
		 String myStr="";
	        System.out.println("Enter the string :");
	        try
	        {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            myStr = br.readLine();
	            char[] ReverseStr= myStr.toCharArray();
	            for (int i = ReverseStr.length-1; i >= 0;i--)
	            System.out.print(ReverseStr[i]);
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
		 }
		
		
	
	}
	


