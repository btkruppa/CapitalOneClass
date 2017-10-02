package com.capitalone.q2;

public class Q2 {
	public static void main(String[] args) {
		int limit = 25;
		int n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (int i = 2; i < limit; i++)// loop starts from 2

		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}
}
