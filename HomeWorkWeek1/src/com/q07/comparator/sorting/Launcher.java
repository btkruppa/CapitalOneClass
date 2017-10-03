package com.q07.comparator.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Launcher {
	
	public static void main(String[] args) {
		
		EmployeeComparator ec = new EmployeeComparator();
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee em1 = new Employee("tom", 10, 45);
		Employee em2 = new Employee("sam", 40, 40);		
		Employee em3 = new Employee("cat", 30, 70);		
		Employee em4 = new Employee("sam", 30, 40);		
		Employee em5 = new Employee("tom", 10, 44);
		
		employees.add(em1);
		employees.add(em2);	
		employees.add(em3);	
		employees.add(em4);
		employees.add(em5);
		
		Collections.sort(employees, ec);

		
		System.out.println("Sorted Employees: "+ employees);
		
	}

}
