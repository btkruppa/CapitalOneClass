package com.capitalone.q19;

import java.util.ArrayList;
import java.util.List;

public class Q19 {

	public static void main(String[] args) {
		List<Integer> myIntList = new ArrayList<Integer>();

		for (int x = 1; x <= 10; x++) {
			myIntList.add(x);
		}

		System.out.println();
		System.out.println("Integrer values in Array list: " + myIntList);

		ArraylistClass ac = new ArraylistClass();

		ac.printEven(myIntList);

		ac.printOdd(myIntList);

		myIntList = ac.removePrime(myIntList);

		System.out.println("Printing Arraylist after removing prime numbers: " + myIntList);

	}

}
