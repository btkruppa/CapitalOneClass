package com.q01.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int bubbleSort[] = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };

		for (int i = 0; i < bubbleSort.length; i++) {

			for (int j = 0; j < bubbleSort.length - i - 1; j++) {

				if (bubbleSort[j] > bubbleSort[j + 1]) {

					int temp = bubbleSort[j];
					bubbleSort[j] = bubbleSort[j + 1];
					bubbleSort[j + 1] = temp;

				}

			}

		}

		for (int k = 0; k < bubbleSort.length; k++) {

			System.out.println(bubbleSort[k]);
		}
	}
}
