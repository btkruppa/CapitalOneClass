package com.capital.one.var.args;

public class VarArgsExample {
	public static void main(String[] args) {
		add(1, 2, 3, 4);
		add(1,2);
	}

	private static void add(int i, int j, int... theRest) {
		int sum = i + j;
		for(int other: theRest) {
			System.out.println(other);
			sum += other;
		}
		System.out.println("the sum is " + sum);
		

	}
}
