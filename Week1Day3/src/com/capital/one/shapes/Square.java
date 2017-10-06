package com.capital.one.shapes;

public class Square implements Shape {

	private float sideLength;

	public Square(float sideLength) {
		super();
		this.sideLength = sideLength;
	}

	@Override
	public double getArea() {
		return sideLength * sideLength;
	}
	
	public double getArea(int sideLength) {
		return 1.5;
	}

}
