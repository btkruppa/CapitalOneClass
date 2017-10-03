package q8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPalindromes {
	
	public static void main(String[] args) {
		ArrayList<String>  stringArrayList = new ArrayList<String>();
		stringArrayList.add("karan");
		stringArrayList.add("madam");
		stringArrayList.add("tom");
		stringArrayList.add("civic");
		stringArrayList.add("radar");
		stringArrayList.add("sexes");
		stringArrayList.add("jimmy");
		stringArrayList.add("kayak");
		stringArrayList.add("john");
		stringArrayList.add("refer");
		stringArrayList.add("billy");
		stringArrayList.add("did");
		
		List<String> polyString = new ArrayList<String>();
		for (int i = 0; i < stringArrayList.size(); i++) {
			String stringArrayList1 = stringArrayList.get(i);
			if(stringArrayList1.equals(new StringBuilder(stringArrayList1).reverse().toString()) == true) {
				polyString.add(stringArrayList1);
			}
			
		}
		
		System.out.println("Original List: " + stringArrayList);
		System.out.println("Polindrome list: " + polyString);
	}
	
	

}
