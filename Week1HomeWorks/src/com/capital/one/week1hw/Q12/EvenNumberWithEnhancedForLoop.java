package com.capital.one.week1hw.Q12;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberWithEnhancedForLoop {

	public static void main(String[] args) {

		List<Integer> myNumberList = new ArrayList<Integer>();
		List<Integer> evenNumberList = new ArrayList<Integer>();

		for (int i = 0; i <= 100; i++) {
			myNumberList.add(i);

		}
		for (int j = 0; j < myNumberList.size(); j++) {

			if (myNumberList.get(j) % 2 == 0) {
				evenNumberList.add(j);
			}
			
		}
		System.out.println("List of even numbers: \n" + evenNumberList );


	}

}
