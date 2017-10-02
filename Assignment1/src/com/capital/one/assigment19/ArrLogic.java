package com.capital.one.assigment19;

import java.util.ArrayList;

public class ArrLogic {

	public static void main(String[] args) {
		int evennumber = 0;
		int oddnumber = 0;

		ArrayList<Integer> abc = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			abc.add(i);
		}

		for (int i = 0; i <= 10; i++) {
			System.out.print(abc.get(i) + " ");
			if (abc.get(i) % 2 == 0) {
				evennumber = evennumber + abc.get(i);
			} else {
				oddnumber = oddnumber + abc.get(i);
			}
		}
		System.out.println("\nTotal Even Number :" + evennumber);
		System.out.println("\nTotal Odd Number :" + oddnumber);

		for (int i = 1; i < abc.size(); i++) {
			if ((abc.get(i) == 2) || abc.get(i) == 3) {
				abc.remove(i);
				i--;
			} else if (!(abc.get(i) % 2 == 0)) {
				if (!(abc.get(i) % 3 == 0)) {
					abc.remove(i);
					i--;

				}
			}
		}
		System.out.println("Total Entries in the Array after removing the Prime Numbers : " + abc.size());

	}
}