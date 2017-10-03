package com.capital.one.week1hw.Q9;


import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myNumbers = new ArrayList<Integer>();
		List<Integer> myPrimeList = new ArrayList<Integer>();
		boolean isPrime = false;

		for (int i=0; i<=100; i++){
			myNumbers.add(i);
			for(int j=2; j<i; j++) {
				if((i%j) == 0) {
					isPrime	 = false;
					break;
				}
			}
			if(isPrime) {
				myPrimeList.add(i);
			}
			isPrime = true;
			
		}
		System.out.println("Prime numbers are: \n" + myPrimeList);
		}
	}
	


