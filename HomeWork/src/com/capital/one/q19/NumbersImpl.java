package com.capital.one.q19;

import java.util.ArrayList;
import java.util.List;

public class NumbersImpl {

	public static void listNumbers(int[] myArr) {

		for (int i : myArr) {
			System.out.println(i);
		}
	}

	public static List<Integer> excludePrime(List<Integer> myArr)
	{
		List<Integer> newList = new ArrayList<Integer>();

		for (int element : myArr)
		{
			if(element %2 ==0)
				newList.add(element);}
		
			return newList;
			
		
	}

	public static int evenNumbers(int[] myArr, String arg2) {
		int sum = 0;
		switch (arg2) {
		case "even":
			for (int element : myArr) {
				if (element % 2 == 0) {
					sum = sum + element;
				}
			}
			return sum;

		default:

			for (int element : myArr) {
				if (element % 2 != 0) {
					sum = sum + element;
				}
			}
			return sum;
		}
	}

}
