package Q3ReverseString;

public class Reverse {

		public static void main(String[] args) {
			
			String string = "Akila Arthy";
			char[] revChar = new char[string.length()];
			
			int j=0;
			for(int i=string.length()-1; i>=0; i--){
				revChar[j] = string.charAt(i);
				j++;
			}
			String reverseString = new String(revChar);
			System.out.println(reverseString);
		}

	}
