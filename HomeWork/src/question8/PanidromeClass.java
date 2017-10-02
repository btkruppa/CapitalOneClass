package question8;

import java.util.ArrayList;

public class PanidromeClass {

	public static void main(String[] args) {

		ArrayList<String> inputStrings = new ArrayList<String>();
		String[] str = { "karan", "madam", "tom", "civic", "radar", "sexes", "jimmy", "kayak", "john", "refer", "billy",
				"did" };
		// inputStrings.add("karan");
		String ip1;
		int x;
		for(x=0; x<str.length; x++){
			ip1 = str[x];
			inputStrings.add(ip1);
		}
		System.out.println("Below are the input Strings to find Palindromes");
		System.out.println(inputStrings);
		
		ArrayList<String> storingPalindromeStr = new ArrayList<String>();
		System.out.println("Below are the Palindromes from the above array list");
		for (String strList : str) {
			StringBuilder sb = new StringBuilder(strList);
			String sb1 = sb.reverse().toString();
			if (strList.equals(sb1)) {
				storingPalindromeStr.add(strList);
				System.out.print(strList + " ");
			}
		}


	}
}
