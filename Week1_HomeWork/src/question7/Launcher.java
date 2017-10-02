package question7;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>();

		employee.add(new Employee("Blake", 21, "Revature"));
		employee.add(new Employee("Amy", 23, "Capitalone"));
		employee.add(new Employee("Sandhya", 22, "Cap1"));
		employee.add(new Employee("Karan", 24, "Revatura"));

		Employee person = new Employee();

		employee.sort(person);

		System.out.println(employee);

	}

}
