package q7;

import java.util.Comparator;

public class NameComparator implements Comparator<EmployeeDetails> {

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {

		return o1.getEmployeeName().charAt(0) - o2.getEmployeeName().charAt(0);
		
	}

}
