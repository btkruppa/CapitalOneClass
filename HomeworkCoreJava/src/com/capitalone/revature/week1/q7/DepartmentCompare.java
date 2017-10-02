//Class to compare based on the Department

package com.capitalone.revature.week1.q7;

import java.util.Comparator;

public class DepartmentCompare implements Comparator<EmployeeData> {

	// Comparator to compare based on the Department
	@Override
	public int compare(EmployeeData e1, EmployeeData e2) {
		return e1.getDepartment() - e2.getDepartment();

	}
}
