package com.capital.one.q12;

public class EvenNumbers {

	public static void main(String[] args) {

		int numbers[] = new int[100];

		for (int i = 0; i < 100; i++) {

			numbers[i] = i + 1;
		}

		for (int element : numbers) {

			if (element % 2 == 0) {
				System.out.println(element);
			}
		}

	}

}
