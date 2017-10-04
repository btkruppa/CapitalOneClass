package com.capital.one.week1hw.Q15;

public class MyMathClass implements ArithmaticInterface {

	@Override
	public double addition(double x, double y) {
		// TODO Auto-generated method stub
		return (x + y);
	}

	@Override
	public double subtraction(double x, double y) {
		// TODO Auto-generated method stub
		return (x > y ? (x - y) : (y - x));
	}

	@Override
	public double multiplication(double x, double y) {
		// TODO Auto-generated method stub
		return (x * y);
	}

	@Override
	public double division(double x, double y) {
		// TODO Auto-generated method stub
		return (x > y ? (x / y) : (y / x));
	}

}
