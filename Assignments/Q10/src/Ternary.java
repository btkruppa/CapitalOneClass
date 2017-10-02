
public class Ternary {

	public static void main(String[] args) {

		int x = 5;
		int y = 4;
		
		System.out.println(minCheck(x,y));
	}

	// Return the less of the two parameters
	static int minCheck(int a, int b) {

		return (a < b ? a : b);
	}
}
