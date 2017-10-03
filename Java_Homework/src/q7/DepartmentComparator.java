package q7;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<EmployeeDetails> {

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		return o1.getEmployeeDepartment().charAt(0) - o2.getEmployeeDepartment().charAt(0);

	}

}
