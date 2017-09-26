package Q2;

public class Fibonacci {

	public static void main(String[] args) {

		// set 0
		int y = 0;
		// sysout 0
		System.out.println(y);
		
		// set 1 for the Fibonacci loop
		int x = 1;

		// Simply add x to itself for 25 times (0 thru 24) and output
		for (int i = 0; i < 25; i++) {

			System.out.println(x);
			x += x;
			
		}
	}
}