package com.capital.one.comparing;

import java.util.Arrays;

public class Launcher {
	public static void main(String[] args) {
		
		for(String s: args) {
			System.out.println(s);
		}
		Candy[] myCandy = {
			new Candy("snickers", 9, "sweet"),
			new Candy("KitKat", 11, "sour"),
			new Candy("M&M", 10, "spicey"),
			new Candy("twix", 8, "salty"),
			new Candy("Almond Joy", 11, "sweet") 
		};
		CandyFlavorComparator cfc = new CandyFlavorComparator();
				
		
	
		Candy snickers = new Candy("snickers", 9, "sweet");
		Candy kitkat = new Candy("KitKat", 7, "salty");
		
//		snickers.compareTo(kitkat);
		
		CandyNameComparator cc = new CandyNameComparator();
		cc.compare(snickers, kitkat);
		
		System.out.println("comparator: " + cfc.compare(snickers, kitkat));
	
		Arrays.sort(myCandy);
		
		for(Candy candy: myCandy) {
			System.out.println(candy);
		}
	}
}
