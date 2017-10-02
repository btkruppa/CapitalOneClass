package com.capital.one.q1;


public class BubbleSort {

	public static void main(String[] args) {

		int[] x = { 3, 5, 4, 2, 0, 2, 6, 1 };

		for (int j = x.length; j >= 0; j--) {
			for (int i = 1; i < x.length; i++) {
				int temp = 0;
				if (x[i - 1] > x[i]) {
					temp = x[i - 1];
					x[i - 1] = x[i];
					x[i] = temp;
				}
			}

		}

		System.out.println("**** After bubble sort **** ");

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
//This solution is for performing bubble sort