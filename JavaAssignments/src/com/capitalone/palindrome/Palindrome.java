package com.capitalone.palindrome;

public class Palindrome {
	boolean flag = true;
	String temp;
	public void getPalindrome(String[] myarr) {
		for(int j=0; j<myarr.length; j++) {
			temp = myarr[j].toString().toUpperCase();
			for(int i=0; i<temp.length()/2; i++) {
				if(temp.charAt(i)!= temp.charAt(temp.length()-1-i)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(myarr[j]);
			}
			flag = true;
		}
	}
}
