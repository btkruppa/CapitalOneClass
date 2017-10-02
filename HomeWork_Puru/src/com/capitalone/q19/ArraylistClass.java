package com.capitalone.q19;

import java.util.ArrayList;
import java.util.List;

public class ArraylistClass {
	public void printEven(List<Integer> myList) {
		System.out.println("Printing out Even Numbers");
		for (int element : myList) {
			if (element % 2 == 0) {
				System.out.println(element);
			}
		}
	}

	public void printOdd(List<Integer> myList) {
		System.out.println("Printing out Odd Numbers");
		for (int element : myList) {
			if (element % 2 != 0) {
				System.out.println(element);
			}
		}
	}

	public List<Integer> removePrime(List<Integer> myList) {

		boolean divisible;
		List<Integer> newList = new ArrayList<Integer>();

		for (int element : myList) {
			divisible = false;
			for (int x = 2; x < element; x++) {
				if (element % x == 0) {
					divisible = true;
				}
			}
			if (divisible == true) {

				newList.add(element);
			}
		}
		return newList;
	}

}
