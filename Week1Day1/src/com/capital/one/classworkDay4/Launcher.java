package com.capital.one.classworkDay4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.capital.one.beans.Fruits;

public class Launcher {
	public static void main(String[] args){
		
		List<Fruits> fruit = new ArrayList<Fruits>();
		
		fruit.add(new Fruits("Apple", 5));
		fruit.add(new Fruits("Banaba", 10));
		fruit.add(new Fruits("Kiwi", 15));
		fruit.add(new Fruits("Peach", 10));
		fruit.add(new Fruits("Mango", 7));
		fruit.add(new Fruits("Watemelon", 6));
		
		Collections.sort(fruit);
		System.out.println(fruit);
	}
}
