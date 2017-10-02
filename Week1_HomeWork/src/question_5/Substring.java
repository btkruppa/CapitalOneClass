package question_5;


import java.util.ArrayList;
import java.util.List;

public class Substring {
	
	public static void main(String[] args) {
		String str = "Hello ";
		int idx = 3;
		Substring(str, idx);
		
		System.out.println("Print String str and idx");
		
		
	}

	private static void Substring(String str, int idx) {
		List<String> temp = new ArrayList<>();
		 String otherString = new String();
         for (int i = 0; i <= idx; i++) {

                         otherString = otherString + str.charAt(i);

         }
         System.out.println(otherString);
		
		
		
	}

}
