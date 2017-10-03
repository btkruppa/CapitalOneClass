package com.capital.one.week1hw.Q7;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeLauncher {
	public static void main(String[] args){
		
		EmployeeComparator empComp = new EmployeeComparator();
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		
		Employee a = new Employee("Tom", "Small Business", 35);
		Employee b = new Employee("Dick", "Targeting Service", 29);
		Employee c = new Employee("Harry", "Small Business", 38);
		Employee d = new Employee("Sally", "Acquisitions", 52);
		Employee e = new Employee("Harry", "Small Business", 45);
		Employee f = new Employee("Dick", "Consumer Card", 29);
		
		employee.add(a);
		employee.add(b);
		employee.add(c);
		employee.add(d);
		employee.add(e);
		employee.add(f);
		
		Collections.sort(employee,empComp);
		System.out.println (employee);
		
	}

}
