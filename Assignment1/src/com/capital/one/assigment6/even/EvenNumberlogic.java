package com.capital.one.assigment6.even;

public class EvenNumberlogic {

	public void numberLogic(int n) {
		if((n &1) == 0)
		{
			System.out.println("Number Enter " + n);
			System.out.println("its even");
		}
		else{
			System.out.println("Number Enter " + n);
			System.out.println("its odd");
		}
	}

}
