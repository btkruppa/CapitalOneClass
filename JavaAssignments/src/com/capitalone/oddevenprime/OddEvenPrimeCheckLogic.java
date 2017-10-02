package com.capitalone.oddevenprime;

import java.util.ArrayList;

public class OddEvenPrimeCheckLogic {
	public void oddEvenPrime(int num) {
		ArrayList<Integer> myarr = new ArrayList<>();
		ArrayList<Integer> prime = new ArrayList<>();
		ArrayList<Integer> nonprime = new ArrayList<>();
		int even=0;
		int odd=0;
		boolean flag;
		for(int i=1;i<=num;i++) {
			myarr.add(i);
		}
		for(int i=0;i<myarr.size();i++) {
			if ((myarr.get(i)%2)==0) {
				even=even+myarr.get(i);
			}
			else odd=odd+myarr.get(i);
			flag = true;
			for(int j=2;j<myarr.get(i);j++) {
				if ((myarr.get(i)%j)==0) {
					flag=false;
					break;
				}
			}
			if (flag) {
				prime.add(myarr.get(i));
			}
			else nonprime.add(myarr.get(i));
		}
		System.out.println("Actual List: " + myarr);
		System.out.println("Sum of Even Numbers: " + even);
		System.out.println("Sum of Odd Numbers:  " + odd);
		System.out.println("Prime Numbers:  " + prime);
		System.out.println("Non-Prime Numbers:  " + nonprime);
	}
}
