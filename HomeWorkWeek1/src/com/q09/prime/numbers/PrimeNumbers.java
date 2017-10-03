package com.q09.prime.numbers;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {

			numbers.add(i);

			isPrimeNumber(i);
		}

	}

	private static void isPrimeNumber(int i) {

		int num = 0;

		for (int k = 2; k <= i; k++) {
			if (i % k == 0) {
				num = num + 1;
			}
		}
		if (num == 1) {
			System.out.println(i);
		}

	}

}
