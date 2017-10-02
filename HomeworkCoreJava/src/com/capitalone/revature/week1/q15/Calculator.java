//Class with CalculatorInterface implementation

package com.capitalone.revature.week1.q15;

public class Calculator implements CalculatorInterface {

	private int first;
	private int second;

	// Constructors
	public Calculator() {
		super();
	}

	public Calculator(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

	// Getters and Setters for the private variables in the Class
	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	// Implementation of abstract methods from Interface
	public int addition(int first, int second) {
		return first + second;
	}

	public int subtraction(int first, int second) {
		return first - second;
	}

	public int multiplication(int first, int second) {
		return first * second;
	}

	public int division(int first, int second) {
		return first / second;
	}

	@Override
	public String toString() {
		return "Calculator [first=" + first + ", second=" + second + "]";
	}
}
