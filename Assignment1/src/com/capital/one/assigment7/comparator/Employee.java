package com.capital.one.assigment7.comparator;

import java.util.ArrayList;

public class Employee {

	public static void main(String[] args) {
		EmployeeData ed = new EmployeeData();
		ed.setName("uday");
		ed.setAge(21);
		ed.setDepartment(123455);
		System.out.println(ed.getName() + " " + ed.getAge() + " " + ed.getDepartment());

		ArrayList<EmployeeData> newemployee = new ArrayList<EmployeeData>();
		newemployee.add(new EmployeeData("Uday", 908, 32));
		newemployee.add(new EmployeeData("day", 108, 33));
		System.out.println(newemployee);
	}

}
