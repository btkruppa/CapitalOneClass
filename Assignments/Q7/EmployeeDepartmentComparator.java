package Q7;

import java.util.Comparator;

public class EmployeeDepartmentComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getDepartment().charAt(0) - o2.getDepartment().charAt(0);
		
		//return 0;
	}
}


