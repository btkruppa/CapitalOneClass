package com.capital.one.q7;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>();

		employee.add(new Employee("Brunda", 21, "Card"));
		employee.add(new Employee("Akila", 20, "Bank"));
		employee.add(new Employee("Abila", 20, "Revature"));
		employee.add(new Employee("Blake", 24, "Bevature"));

		Employee emp = new Employee();

		employee.sort(emp);

		System.out.println(employee);
	}

}
