package question3;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello";
		char[] revChar = new char[str.length()];
		
		int j=0;
		for(int i=str.length()-1; i>=0; i--){
			revChar[j] = str.charAt(i);
			j++;
		}
		String reverseString = new String(revChar);
		System.out.println(reverseString);
	}

}
