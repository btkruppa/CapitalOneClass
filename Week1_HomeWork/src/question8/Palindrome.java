package question8;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	
	public static void main(String[] args) {
		List<String> List = new ArrayList<>();
		
		List.add("kayak");
	    List.add("scooter");
		List.add("madam");
		List.add("mom");
		List.add("book");
		for (String element : List) {

			StringBuilder sb = new StringBuilder(element);
			String s2 = sb.reverse().toString();
			if (element.equals(s2)) {
				System.out.println(element);
			}
		}
		
		
	}

}
