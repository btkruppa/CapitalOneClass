
public class Output {

	public static void main(String[] args) {
		
		int[] myArray = new int [100];
		
		 //Fill an array with 12 consecutive numbers
		for (int k = 0; k < 100; k++) {
			myArray[k] = k;
			
		}

		// Array increment counter
		int k = 0;
		
		// Outer loop.  Loop through 4 times to get 4 lines of output
		for (int i = 1; i < 5; i++) {
			//Nested loop to alternately sysout print (not println) the modulus in the myArray array
			// i.e. First time through outer loop print 1 modulus result. Second time through print 2 and so on
			for (int j = 0; j < i; j++) {
				
				System.out.print(myArray[k] % 2 + " ");
				// Bump up the myArray index after each sysout print
				k++;
			}
			//Print new line at end of each iteration of outer loop
			System.out.println("");
		}
	}
}

