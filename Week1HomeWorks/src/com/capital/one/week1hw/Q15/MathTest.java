package com.capital.one.week1hw.Q15;

public class MathTest {

	public static void main(String[] args) {
		int x = 20;
		int y = 16;

		MyMathClass myOperand = new MyMathClass();
		System.out.println("Addition Result: " + myOperand.addition(x, y));
		System.out.println("Subtraction Result: " + myOperand.subtraction(x, y));
		System.out.println("Multiplication Result: " + myOperand.multiplication(x, y));
		System.out.println("Division result: " + myOperand.division(x, y));

	}

}
