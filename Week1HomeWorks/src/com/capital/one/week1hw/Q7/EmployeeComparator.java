package com.capital.one.week1hw.Q7;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee a, Employee b) {

		if (a.getEmployeeName().charAt(0) < b.getEmployeeName().charAt(0)) {
			return -1;
		} else if (a.getEmployeeName().charAt(0) > b.getEmployeeName().charAt(0)) {
			return 1;
		} else if (a.getDepartment().charAt(0) < b.getDepartment().charAt(0)) {
			return -1;
		} else if (a.getDepartment().charAt(0) > b.getDepartment().charAt(0)) {
			return 1;
		} else {
			if (a.getAge() < b.getAge()) {
				return -1;
			} else if (a.getAge() > b.getAge()) {
				return 1;
			} else
				return 0;

		}

	}


}
