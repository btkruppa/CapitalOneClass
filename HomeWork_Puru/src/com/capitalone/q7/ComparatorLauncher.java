package com.capitalone.q7;

import java.util.Arrays;

public class ComparatorLauncher {

	public static void main(String[] args) {

		Employee e1 = new Employee("Reddy", "MechanicalEngineering", 26);
		Employee e2 = new Employee("Karan", "ComputerScience", 34);

		Employee[] Employees = { e1, e2 };

		Name nc = new Name();

		Arrays.sort(Employees, nc);
		System.out.println("Sorted by Name");
		System.out.println(Employees[0]);
		System.out.println(Employees[1]);

		Department dc = new Department();

		Arrays.sort(Employees, dc);
		System.out.println("Sorted by Department");
		System.out.println(Employees[0]);
		System.out.println(Employees[1]);

		Age ac = new Age();

		Arrays.sort(Employees, ac);
		System.out.println("Sorted by Age");
		System.out.println(Employees[0]);
		System.out.println(Employees[1]);

	}

}
