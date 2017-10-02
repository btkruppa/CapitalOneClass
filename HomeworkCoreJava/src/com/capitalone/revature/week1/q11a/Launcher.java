//Write a program that would access two float-variables from a class that exists in another package.
//Note, you will need to create two packages to demonstrate the solution.

package com.capitalone.revature.week1.q11a;

import com.capitalone.revature.week1.q11b.FloatNumbers;

public class Launcher {

	// Access two float-variables from a class that exists in another package
	public static void main(String[] args) {
		FloatNumbers floatNumbers = new FloatNumbers();

		// Assign the values to float variables
		floatNumbers.setFirst(10.0f);
		floatNumbers.setSecond(20f);

		// Retrieve the value assigned to float variables
		System.out.println("First Float variable value : " + floatNumbers.getFirst());
		System.out.println("Second Float variable value : " + floatNumbers.getSecond());
	}
}
