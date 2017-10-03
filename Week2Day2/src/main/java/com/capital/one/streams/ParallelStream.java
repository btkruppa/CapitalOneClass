package com.capital.one.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;

public class ParallelStream {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("hello");
		myList.add("longer string");
		myList.add("s");
		myList.add("goodbye");
		myList.add("again");
		myList.add("words");
		myList.add("cat");
		myList.add("computer");
		myList.add("elephant");
		myList.add("streams");

		myList.parallelStream().forEach((myVar) -> {
			// System.out.println(Thread.currentThread().getName());
			System.out.println(myVar);
		});

		// myList.parallelStream().filter((element) -> {
		// return true;
		// });

		//this is one way
//		List<String> filteredList = myList
//				.parallelStream()
//				.filter((element) -> (element.length() < 5) ? true : false )
//				.collect(Collectors.toList());
		
		List<String> filteredList = myList
				.parallelStream()
				.filter((String element) -> {
					if(element.length() < 5) {
						return true;
					}
					return false;
				})
				.collect(Collectors.toList());
		
		System.out.println("original: " + myList);
		System.out.println("filtered: " + filteredList);
	}
}
