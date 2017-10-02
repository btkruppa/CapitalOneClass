// Display the triangle of zeros and one's on the console using any type of
// loop

//In Progress

package com.capitalone.revature.week1.q13;

public class NumberTriangle {

	public static void main(String[] args) {
		for (int outerLoop=1;outerLoop<5 ;outerLoop++ )
		    {
			  System.out.print(outerLoop - 1);
		        for(int innerLoop=1;innerLoop<outerLoop;innerLoop++)
		        {
		            System.out.print(" 0");
		        }
		        System.out.print("\n");
		    }
	}
}
