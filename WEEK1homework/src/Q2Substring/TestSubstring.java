package Q2Substring;

public class TestSubstring {

	public static void main(String[] args) {
		
		String s="JavaWorld";
		int index=1;
		TestSubstring(s,index);

	}

	private static void TestSubstring(String s, int index) {
		String getStr = new String();
		for (int i = 0; i <= index; i++) {

			getStr = getStr + s.charAt(i);

		}
		System.out.println(getStr);
	}
		
	

}

