//Sort two employees based on their name, department and age using the Comparator interface

package com.capitalone.revature.week1.q7;

import java.util.Arrays;

public class Launcher {
	public static void main(String[] args) {

		// Add two employee objects
		EmployeeData[] employee = { new EmployeeData("Emp2", 300, 25), new EmployeeData("Emp1", 200, 35) };

		// print the data before sort
		System.out.println("Data before Sort: \n");
		for (EmployeeData e : employee) {
			System.out.println(e);
		}

		// Instance of class with compare method
		NameCompare empName = new NameCompare();

		// Sort the data based on name
		Arrays.sort(employee, empName);

		// print the sorted data
		System.out.println("\nData after Sort based on Name: \n");
		for (EmployeeData e : employee) {
			System.out.println(e);
		}

		// Sort the data based on Department
		DepartmentCompare empDepartment = new DepartmentCompare();
		Arrays.sort(employee, empDepartment);

		// print the sorted data
		System.out.println("\nData after Sort based on Department: \n");
		for (EmployeeData e : employee) {
			System.out.println(e);
		}

		// Sort the data based on Age
		AgeCompare employeeAge = new AgeCompare();
		Arrays.sort(employee, employeeAge);

		// print the sorted data
		System.out.println("\nData after Sort based on Age: \n");
		for (EmployeeData e : employee) {
			System.out.println(e);
		}
	}
}
