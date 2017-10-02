//Class that accepts two float numbers as input and provides getters/setters to access them from outside of the class

package com.capitalone.revature.week1.q11b;

public class FloatNumbers {
	private float first;
	private float second;

	public FloatNumbers() {
		super();
	}

	// Constructor that accepts two float variables and assigns to the private
	// variables in the class
	public FloatNumbers(float first, float second) {
		super();
		this.first = first;
		this.second = second;
	}

	// Retrieve First float value
	public float getFirst() {
		return first;
	}

	// Assign First float value
	public void setFirst(float first) {
		this.first = first;
	}

	// Retrieve Second float value
	public float getSecond() {
		return second;
	}

	// Assign Second float value
	public void setSecond(float second) {
		this.second = second;
	}

}
