package com.capitalone.q1;

public class Q1 {

	public static void main(String[] args) {

		int intArray[] = new int[] { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };
		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

		bubbleSort(intArray);

		System.out.println("");

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

	public static void bubbleSort(int[] intArray) {
		int temp = 0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 1; j < (intArray.length - i); j++) {

				if (intArray[j - 1] > intArray[j]) {
					// swap the elements!
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}

			}
		}

	}
}
