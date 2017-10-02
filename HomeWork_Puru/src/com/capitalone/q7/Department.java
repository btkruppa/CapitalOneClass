package com.capitalone.q7;

import java.util.Comparator;

public class Department implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

	
		int department1;
		int department2;

		switch (o1.getDepartment()) {
		case "ComputerScience":
			department1 = 1;
			break;
		case "MechanicalEngineering":
			department1 = 2;
			break;
		case "CivilEngineering":
			department1 = 3;
			break;
		case "InformationTechnology":
			department1 = 4;
			break;
		default:
			department1 = 12;
		}

		switch (o2.getDepartment()) {
		case "ComputerScience":
			department2 = 1;
			break;
		case "MechanicalEngineering":
			department2 = 2;
			break;
		case "CivilEngineering":
			department2 = 3;
			break;
		case "InformationTechnology":
			department2 = 4;
			break;
		default:
			department2 = 12;
		}

		return (department1 - department2);
	}

}
