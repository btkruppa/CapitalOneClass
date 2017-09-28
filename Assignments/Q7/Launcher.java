package Q7;

import java.util.Arrays;

public class Launcher {

	public static void main(String[] args) {
		
		//Create 3 Employees (I know assignment says 2) and store in array of Employee objects, myEmployee
		Employee[] myEmployee = new Employee[3];
		
		myEmployee[0] = new Employee("Accounting","Joe",44);
		myEmployee[1] = new Employee("Marketing","Diane",33);
		myEmployee[2] = new Employee("Sales","Mike",23);
		
		//Create a DepartmentComparator object which subtracts first Char At of two Employee Department Strings
		EmployeeDepartmentComparator edc = new EmployeeDepartmentComparator();
		
		//Sort on Employee Department
		Arrays.sort(myEmployee, edc);
		
		System.out.println("Sorted by Department");
		
		//Sysout sorted array
		for (Employee employee: myEmployee) {
			System.out.println(employee);
		}
		System.out.println("\n");
		
		//Create a NameComparator object which subtracts first Char At of two Employee Name Strings
		EmployeeNameComparator enc = new EmployeeNameComparator();
		
		System.out.println("Sorted by Name");
		
		//Sort by Name and sysout sorted array of Employees
		Arrays.sort(myEmployee, enc);
		
		for (Employee employee: myEmployee) {
			
			System.out.println(employee);
		}
		
		System.out.println("\n");
		
		// Do the same for Age as done with Name and Dept above
		EmployeeAgeComparator eac = new EmployeeAgeComparator();
		
		Arrays.sort(myEmployee, eac);
		
		System.out.println("Sorted by Age");
		
		for (Employee employee: myEmployee) {
			System.out.println(employee);
		}
			
	}
}
