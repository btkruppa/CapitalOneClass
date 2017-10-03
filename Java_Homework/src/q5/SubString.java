package q5;

import java.util.Scanner;

public class SubString {

	static String str;
	static int idx;

	public static void main(String[] args) {
		System.out.println("Enter the String: \r");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		System.out.println("Enter the id number to return the Sub String: \r");
		idx = scanner.nextInt();
		System.out.println(subString(str, idx));
		scanner.close();

	}

	public static String subString(String str, int idx) {
		String strTemp = "";
		for (int i = 0; i < idx; i++) {
			strTemp += str.charAt(i);
		}
		return strTemp;
	}

}
