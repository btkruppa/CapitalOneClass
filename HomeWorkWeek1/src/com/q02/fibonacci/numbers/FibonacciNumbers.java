package com.q02.fibonacci.numbers;

public class FibonacciNumbers {

	public static void main(String[] args) {

		int fibNum[] = new int[25];

		for (int i = 0; i < 25; i++) {

			if (i < 2) {
				
				fibNum[i] = i;
				
			} else {

				fibNum[i] = fibNum[i - 2] + fibNum[i - 1];
				
				
			}
			
		}

		for (int j = 0; j < fibNum.length; j++) {
			System.out.println(fibNum[j]);
		}
	}

}
