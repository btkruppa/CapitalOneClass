package com.q07.comparator.sorting;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		// return (o1.getName().charAt(0) - o2.getName().charAt(0));
		// }

		if (o1.getName().charAt(0) < o2.getName().charAt(0)) {
			return -1;
		} else if (o1.getName().charAt(0) > o2.getName().charAt(0)) {
			return 1;
		} else if (o1.getDepartmentNumber() < o2.getDepartmentNumber()) {
			return -1;
		} else if (o1.getDepartmentNumber() > o2.getDepartmentNumber()) {
			return 1;
		} else {
			if (o1.getAge() < o2.getAge()) {
				return -1;
			} else if (o1.getAge() > o2.getAge()) {
				return 1;
			} else
				return 0;

		}

	}

}
