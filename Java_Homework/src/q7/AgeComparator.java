package q7;

import java.util.Comparator;

public class AgeComparator implements Comparator<EmployeeDetails>{

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		return o1.getEmployeeAge() - o2.getEmployeeAge();
		
	}

}
