package com.capitalone.revature.week1.q11a;

import com.capitalone.revature.week1.q11b.FloatNumbers;

public class Launcher {

	// Access two float-variables from a class that exists in another package
	public static void main(String[] args) {
		FloatNumbers floatNumbers = new FloatNumbers();

		// Assign the values to float variables
		floatNumbers.setF1(10.0f);
		floatNumbers.setF2(20f);

		// Retrieve the float variables value
		System.out.println("First Float variable value : " + floatNumbers.getF1());
		System.out.println("Second Float variable value : " + floatNumbers.getF2());
	}
}
