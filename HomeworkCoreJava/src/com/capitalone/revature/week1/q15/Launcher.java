//Define Interface with methods, implement them in a class and use two hard coded variables 
//in main to call the implemented methods 

package com.capitalone.revature.week1.q15;

public class Launcher {
	public static void main(String[] args) {
		// Two Integer Variables
		int first = 10;
		int second = 5;

		// Instantiate the Calculator object
		Calculator calc = new Calculator();

		// Execute implemented methods from Calculator class
		System.out.println("Addition of " + first + " and " + second + " : " + calc.addition(first, second));
		System.out.println("Subtraction of " + second + " from " + first + " : " + calc.subtraction(first, second));
		System.out
				.println("Multiplication of " + first + " and " + second + " : " + calc.multiplication(first, second));
		System.out.println("Division of " + first + " and " + second + " : " + calc.division(first, second));
	}
}
