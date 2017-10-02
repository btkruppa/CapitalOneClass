package com.capitalone.nfact;

public class NFactLogic {
	int k = 1;
	public void getNfactLogic(int counter) {
		System.out.println("The " + counter + "factorial is");
		for(int j=counter; j>=1; j--) {
			k = k*j;
			System.out.println(j +"*\t");
		}
		System.out.println(k);
	}
}
