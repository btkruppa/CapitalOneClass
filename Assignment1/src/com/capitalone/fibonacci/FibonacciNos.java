package com.capitalone.fibonacci;

public class FibonacciNos {

	static int a = 0;
	static int b = 0;
	static int c = 1;
	static int i;
	static int count = 25;

	public static void main(String[] args) {
		System.out.println(a);
		for (int i = 0; i < count; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(c);
		}

	}

}
