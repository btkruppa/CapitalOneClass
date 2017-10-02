package com.capital.one.q19;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

	public static void main(String[] args) {
		int[] myArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		List<Integer> intList = new ArrayList<Integer>();
		for (int index = 0; index < myArr.length; index++) {
			intList.add(myArr[index]);
		}

		System.out.println(" list of elements in the array list are" + "\n");

		NumbersImpl.listNumbers(myArr);
		System.out.println("Sum of even numbers is " + NumbersImpl.evenNumbers(myArr, "even"));
		System.out.println("Sum of odd numbers is " + NumbersImpl.evenNumbers(myArr, "odd"));
		System.out.println("Only Even numbers in the array " + NumbersImpl.excludePrime(intList));
	}

}
