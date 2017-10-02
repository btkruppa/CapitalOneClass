package com.capitalone.evennum;

public class EvenNumLogic {
	public void getEvenNum(int num) {
		if((num&1) == 0) {
			System.out.println("Even");
		}
		else
			System.out.println("odd");
	}
}
