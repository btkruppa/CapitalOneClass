package com.capital.one.week1hw.Q1;

public class BubbleSort {
	 static void bubbleSort(int[] arr) {

		int bubbleTemp = 0;

		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i] > arr[i+1]) {
					bubbleTemp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = bubbleTemp;
				}
			}
		}

	}
}
