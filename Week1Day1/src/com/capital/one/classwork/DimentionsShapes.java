package com.capital.one.classwork;


public abstract class DimentionsShapes implements shape {
	public static void main (String[] args){
		shape firstTriangle = new triangle();
		int x= firstTriangle.getArea();
		System.out.println("Area of triangle " + x );
		System.out.println("Number of sides " + firstTriangle.getNumberOfSides());
		
		shape firstSquare = new square();
		int y= firstSquare.getArea();
		System.out.println("Area of square " + y );
		System.out.println("Number of Sides " + firstSquare.getNumberOfSides());
		
	}

}
