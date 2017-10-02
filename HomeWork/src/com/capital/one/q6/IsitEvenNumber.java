package com.capital.one.q6;

public class IsitEvenNumber {

	public static void main(String[] args) {

		Integer x = 24;

		int i = IsitEvenNumberImpl.evenOrOdd(x);

		if (i == 0) {
			System.out.println("Integer is even number");
		} else {
			System.out.println("Integer is odd number");
		}
	}
}
//*** this solution is to output if an interger is odd or even