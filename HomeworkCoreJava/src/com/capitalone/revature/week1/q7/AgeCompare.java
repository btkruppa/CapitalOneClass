//Class to compare based on the Age

package com.capitalone.revature.week1.q7;

import java.util.Comparator;

public class AgeCompare implements Comparator<EmployeeData> {

	// Comparator to compare based on the Age
	@Override
	public int compare(EmployeeData e1, EmployeeData e2) {
		return e1.getAge() - e2.getAge();

	}
}