package com.capital.one.grabage;

public class GarbageCollectionExample {

	public static void main(String[] args) {
		Trash trashA = new Trash(1);
		Trash trashB = new Trash(2);
		Trash trashC = new Trash(3);

		trashB = null; // trash 2 is now eligible for garbace collection
		trashC = trashA; // trash 3 is now eligible for gc
//		trashB = trashC; // does not affect gc eligibility
//		trashA = null; // does not affect gc eligibility
		
//		System.gc();
		
		int i = 4;
		while (true) {
			Trash test = new Trash(i++);
		}

	}

}
