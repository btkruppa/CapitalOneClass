package com.capitalone.primenum;

import java.util.ArrayList;
import java.util.List;

public class PrimeNum {
	boolean flag = true;
	List<Integer> myArrayList = new ArrayList<Integer>();
	public void getPrimeNum() {
		for(int i=1; i<=100; i++) {
			for(int j=2; j<i; j++) {
				if((i%j) == 0) {
					flag	 = false;
					break;
				}
			}
			if(flag) {
				myArrayList.add(i);
			}
			flag = true;
			
		}
		System.out.println(myArrayList);
	}
}
