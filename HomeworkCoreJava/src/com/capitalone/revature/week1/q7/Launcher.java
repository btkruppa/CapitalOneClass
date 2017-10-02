package com.capitalone.revature.week1.q7;

public class Launcher {
	public static void main(String[] args) {
		EmployeeData empData = new EmployeeData();
		EmployeeData[] employee = { new EmployeeData("Emp2", 300, 35), new EmployeeData("Emp1", 200, 25) };

		empData.compare(employee[0], employee[1]);
		for(EmployeeData i: employee) {
			System.out.println(employee.toString().toString());
		}
	}

}
