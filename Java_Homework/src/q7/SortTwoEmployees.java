package q7;

public class SortTwoEmployees{

	public static void main(String[] args) {
		
		EmployeeDetails e1 = new EmployeeDetails("Tom","Medical", 35);
		EmployeeDetails e2 = new EmployeeDetails("John","Engineering", 27);
		
		NameComparator nc = new NameComparator();
		AgeComparator ac = new AgeComparator();
		DepartmentComparator dc = new DepartmentComparator();
		
		System.out.println(nc.compare(e1, e2));
		System.out.println(ac.compare(e1, e2));
		System.out.println(dc.compare(e1, e2));
		
		
		

	}

}
