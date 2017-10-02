package com.capitalone.calculation;

public class CalculateBean implements Calculate{

	private int result;
	private int a;
	private int b;
	
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public CalculateBean(int result, int a, int b) {
		super();
		this.result = result;
		this.a = a;
		this.b = b;
	}
	public CalculateBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void calculate() {
		System.out.println("the addition of 2 numbers is "+ addition());
		System.out.println("the subtraction of 2 numbers is "+ subtraction());
		System.out.println("the  division of 2 numbers is "+ division());
		System.out.println("the multiplication of 2 numbers is "+ multiplication());
		
	}
	@Override
	public int addition() {
		result = a+b;
		return result;
	}

	@Override
	public int subtraction() {
		result = a-b;
		return result;
	}

	@Override
	public int division() {
		result = a/b;
		return result;
	}

	@Override
	public int multiplication() {
		result = a*b;
		return result;
	}

}
