package com.capitalone.q7;

import java.util.Comparator;

public class Name implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().charAt(0) - o2.getName().charAt(0);
	}

}
