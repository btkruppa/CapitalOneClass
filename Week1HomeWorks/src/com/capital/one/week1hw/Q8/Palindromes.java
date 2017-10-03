package com.capital.one.week1hw.Q8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindromes {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>(Arrays.asList("karan", "madam", "tom", "civic", "radar", "sexes",
				"jimmy", "kayak", "john", "refer", "billy", "did"));
		List<String> palindromesList = new ArrayList<String>();

		System.out.println("Origininal list of words:" + myList);

		for (int i=0; i<myList.size(); i++){
			String newMyWord = myList.get(i);
			String myReversedWord = new StringBuilder(newMyWord).reverse().toString();
			if (newMyWord.equals(myReversedWord)){
				palindromesList.add(myReversedWord);
			}
			
		}
		System.out.println("List of palindromes: " + palindromesList);


	}

}
