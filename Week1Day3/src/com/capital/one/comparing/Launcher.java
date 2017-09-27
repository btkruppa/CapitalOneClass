package com.capital.one.comparing;

import java.util.Arrays;

public class Launcher {
	public static void main(String[] args) {
		Candy[] myCandy = {
			new Candy("snickers", 9, "sweet"),
			new Candy("KitKat", 11, "sour"),
			new Candy("M&M", 10, "spicey"),
			new Candy("twix", 8, "salty"),
			new Candy("Almond Joy", 11, "sweet") 
		};
		CandyFlavorComparator cfc = new CandyFlavorComparator();
				
		Arrays.sort(myCandy, cfc);
		
		Candy snickers = new Candy("snickers", 9, "sweet");
		Candy kitkat = new Candy("KitKat", 7, "salty");
		
//		snickers.compareTo(kitkat);
		
		CandyNameComparator cc = new CandyNameComparator();
		cc.compare(snickers, kitkat);
		
		System.out.println("comparator: " + cfc.compare(snickers, kitkat));
	
		
		
		for(Candy candy: myCandy) {
			System.out.println(candy);
		}
	}
}
