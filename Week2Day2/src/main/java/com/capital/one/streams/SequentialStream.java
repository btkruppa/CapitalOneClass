package com.capital.one.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SequentialStream {

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
		

		myList.stream().forEach((myVar) -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println(myVar);
		});
	}

}
