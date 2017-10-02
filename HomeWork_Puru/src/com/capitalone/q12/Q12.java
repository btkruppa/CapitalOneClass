package com.capitalone.q12;

import java.util.ArrayList;

public class Q12 {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(100);

		for (int i = 1; i <= 100; i++) {
			numbers.add(i);
		//	System.out.println(numbers.get(i - 1));
		}
		
		for(int element: numbers) {       
				if (element%2 == 0) {        
					System.out.println(element);
				}
		}
	}

}
