package Q5;

public class Substring {

	public static void main(String[] args) {
		
		String partialString;
		//Pass a string and index to method mysub and store result in variable. Then output variable
		partialString = mysub("capital",3);
		System.out.println(partialString);
	}
	
	public static String mysub(String str, int idx) {
		//Define 2 character arrays. One to accept the string parameter and the other to store the partial string
		//Size should be value of idx which is 3 in this example; 0 to 2, or idx -1 = 2 (0 to 2; 3 places)
		char[] ch = new char[idx];
		char[] ch1 = new char[idx];
		
		//Convert incoming string to character array
		ch = str.toCharArray();
				
		// Loop thru 3 times. i < 3 (0,1,2) which is same as 3-1 inclusive
		for (int i = 0; i < idx; i++) {
			//Store idx -1 inclusive starting at 0 number of characters in destination array
			ch1[i] = ch[i];
		}
	
		//Use String object to convert value of ch1 to a string variable and return.
		String myreturn = String.valueOf(ch1);
		return myreturn;
	}
}
