package question7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Launcher {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		Employee emp1 = new Employee();
		emp.add(new Employee("akila", "Collection", 25));
		emp.add(new Employee("bhargavi", "bank", 23));
		emp.add(new Employee("bhargavi", "aard", 23));
		emp.add(new Employee("aanna", "aank", 24));
		
		emp.sort(emp1);	
		System.out.println(emp);
	}

}
