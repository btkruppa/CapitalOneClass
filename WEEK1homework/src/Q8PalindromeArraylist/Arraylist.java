package Q8PalindromeArraylist;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

				ArrayList<String> a2 = new ArrayList<String>(12);
				a2.add("karan");
				a2.add("madam");
				a2.add("tom");
				a2.add("civic");
				a2.add("radar");
				a2.add("sexes");
				a2.add("jimmy");
				a2.add("kayak");
				a2.add("john");
				a2.add("refer");
				a2.add("billy");
				a2.add("did");
			
				for (int x=0;x<12;x++){
			
				StringBuilder input1 = new StringBuilder();	
				input1.append(a2.get(x));
				String input1a=input1.toString();
				//System.out.println(input1);
				 String input2 = input1.reverse().toString();
				//System.out.println(input2);
				
				if (input1a.equals(input2))
					{System.out.println("palindrome");
					StringBuilder input3=new StringBuilder();
					input3.append(input1);
					System.out.println(input3);}
				
				 else if(!input1.toString().equals(input2.toString()))
				{System.out.println("not palindrome");}
				}
	
			}
	
	}
	


	

	




