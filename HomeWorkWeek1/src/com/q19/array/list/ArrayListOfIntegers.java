package com.q19.array.list;

import java.util.ArrayList;

public class ArrayListOfIntegers {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();

		int evnNum = 0, oddNum = 0;

		for (int i = 1; i <= 10; i++) {
			num.add(i);
		}

		System.out.println("Integers in ArrayList: " + num);

		for (int x : num) {

			if (x % 2 == 0) {
				evnNum = evnNum + x;
			} else
				oddNum = oddNum + x;
		}

		System.out.println("Even Numbers Total is: " + evnNum);

		System.out.println("Odd Numbers Total is: " + oddNum);

		for (int j = num.size() - 1; j > 1; j--) {

			int counter = 0;

			for (int k = 2; k < j; k++) {

				if (num.get(j) % k == 0) {

					counter = counter + 1;
				}

			}

			if (counter == 0)
				num.remove(j);

		}

		System.out.println("Integers without even numbers in ArrayList: " + num);
	}

}
