package Q1;

public class BubbleSort {

	public static void main(String[] args) {

		// Initialize Array
		int[] myArr = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };

		// Get Length
		int arrLength = myArr.length;
		
		// Set temp variable to 0
		int temp = 0;

		//Outer Loop to iterate through array
		for (int i = 0; i < arrLength; i++) {
			
			// Inner Loop. Set j to 1; test to see if reached end of Outer Loop
			for (int j = 1; j < (arrLength - i); j++) {
				
				//Compare array element to the next array element
				// If variable is greater than neighbor swap position in array
				// utilizing a temporary variable for the swap
				if (myArr[j - 1] > myArr[j]) {
					
					temp = myArr[j - 1];
					myArr[j - 1] = myArr[j];
					myArr[j] = temp;
				}
			}
		}

		// Print out myArr to confirm the bubble sort worked
		for (int whatever : myArr) {
			System.out.println(whatever);
		}

	}

}
