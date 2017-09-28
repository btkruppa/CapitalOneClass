package Q7;

import java.util.Comparator;

public class Employee implements Comparator<Employee>  {
	
	private String department;
	private String name;
	private int age;
			
	public Employee(String department, String name, int age) {
		super();
		this.department = department;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", name=" + name + ", age=" + age + "]";
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.age - o2.age;
	}
	
}
