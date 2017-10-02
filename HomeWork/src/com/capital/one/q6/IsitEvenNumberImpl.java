package com.capital.one.q6;

public class IsitEvenNumberImpl {

	public static int evenOrOdd(Integer arg) {

		Integer i = arg;

		return Integer.remainderUnsigned(i, 2);

	}

}
