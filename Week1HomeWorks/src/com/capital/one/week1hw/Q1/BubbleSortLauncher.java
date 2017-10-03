package com.capital.one.week1hw.Q1;

public class BubbleSortLauncher extends BubbleSort {

	public static void main(String[] args) {

		int bubbleArray[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		bubbleSort(bubbleArray);
		System.out.println("Sorted Array:");
		for (int i = 0; i < bubbleArray.length; i++)
			System.out.println(bubbleArray[i] );

	}

}
