package com.capital.one.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		
		// create a list of integers
		for (int i = 10; i < 20; i++) {
			li.add(i);
		}
		
		//integer to bank accounts
		List<BankAccount> newList = li.parallelStream().map((element) -> {
			return new BankAccount(element, "Savings");
		}).collect(Collectors.toList());
		
		// integers to strings
		Set<String> strList = li.parallelStream().map((element) -> {
			return element + "str";
		}).collect(Collectors.toSet());

		System.out.println(newList);
		
		System.out.println("set: " + strList);
	}
}
