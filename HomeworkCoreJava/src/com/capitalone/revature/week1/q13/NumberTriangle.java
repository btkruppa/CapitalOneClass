// Display the triangle of zeros and one's on the console using any type of
// loop

package com.capitalone.revature.week1.q13;

public class NumberTriangle {

	public static void main(String[] args) {
		for (int outerLoop = 0; outerLoop < 4; outerLoop++) {
			
			int k = outerLoop;
			
			for (int innerLoop = 0; innerLoop <= outerLoop; innerLoop++) {
				
				
				System.out.print(k % 2 + " ");
				
				k = k+1;
			}
			System.out.print("\n");
		}
	}
}
