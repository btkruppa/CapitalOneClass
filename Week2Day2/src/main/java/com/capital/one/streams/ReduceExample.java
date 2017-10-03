package com.capital.one.streams;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {
	public static void main(String[] args) {
		List<BankAccount> accounts = new ArrayList<BankAccount>();
		accounts.add(new BankAccount(200, "savings"));
		accounts.add(new BankAccount(3000.15, "savings"));
		accounts.add(new BankAccount(13, "checking"));
		accounts.add(new BankAccount(30000.10, "checking"));
		accounts.add(new BankAccount(1212.30, "savings"));
		accounts.add(new BankAccount(30000.10, "checking"));
		accounts.add(new BankAccount(30000.10, "checking"));
		accounts.add(new BankAccount(30000.10, "checking"));
		accounts.add(new BankAccount(30000.10, "checking"));

		Double result = accounts.parallelStream()
				.filter((element) -> {
					if("checking".equals(element.getAccountType())) {
						return true;
					}
					return false;
				})
				.map((BankAccount element) -> {
					return element.getBalance();
				})
				.sequential() // convert it to sequential stream for the reduce function
				.reduce((one, two) -> {
					return one + two;
				})
				.get();
	

		System.out.println(result);

	}
}
