package com.capitalone.q9;

import java.util.ArrayList;
import java.util.List;

public class Q9 {

	public static void main(String[] args) {

		List<Integer> myIntList = new ArrayList<Integer>();
		boolean divisible;

		for (int i = 1; i <= 100; i++) {
			myIntList.add(i);
		}

		for (int p : myIntList) {
			divisible = false;
			for (int x = 2; x < p; x++) {
				if (p % x == 0) {
					divisible = true;
				}
			}
			if (divisible == false) {
				System.out.println(p);
			}
		}

	}

}