package com.capitalone.revature.week1.q1;

public class BubbleSort {
	// Perform a bubble sort on the following integer array:
	// 1,0,5,6,3,2,3,7,9,8,4
	public static void main(String[] args) {
		// Create an int array with data
		int bubble[] = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };

		System.out.println("Before Sort\n");

		for (int b = 0; b < bubble.length; b++) {
			System.out.print(bubble[b] + " ");
		}

		int swapData = 0;

		// repeat for all the data in the array
		for (int b = 0; b < bubble.length; b++) {

			// compare with rest of the data in the array
			for (int s = 1; s < (bubble.length - b); s++) {

				// swap the array data, if data in next index position is
				// greater than the current index
				if (bubble[s - 1] > bubble[s]) {
					swapData = bubble[s - 1];
					bubble[s - 1] = bubble[s];
					bubble[s] = swapData;
				}

			}
		}

		System.out.println("\n\nAfter Sort\n");

		for (int b = 0; b < bubble.length; b++) {
			System.out.print(bubble[b] + " ");
		}
	}
}
