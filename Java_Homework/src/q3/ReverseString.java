package q3;

public class ReverseString {

	public static void main(String[] args) {
		String s = "JAVA";
		System.out.println("Original String: " + s);
		int i;

		System.out.print("Reverse String: ");
		char ch[] = new char[s.length()];
		for (i = 0; i < s.length(); i++)
			ch[i] = s.charAt(i);
		for (i = s.length() - 1; i >= 0; i--)
			System.out.print(ch[i]);
	}

}
