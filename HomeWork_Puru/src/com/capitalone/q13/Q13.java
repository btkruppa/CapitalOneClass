package com.capitalone.q13;

public class Q13 {

	public static void main(String[] args) {
		int zeroOneTracker = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(zeroOneTracker + " ");
				if(zeroOneTracker == 0) {
					zeroOneTracker = 1;
				} else {
					zeroOneTracker = 0;
				}
			}
			System.out.print("\n");
		}
	}

}
