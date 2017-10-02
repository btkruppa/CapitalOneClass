package question7;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

	public Employee(String name, int age, String Department) {
		super();
		this.name = name;
		this.age = age;
		this.Department = Department;
	
	}

	public Employee() {
		super();
	}
	private String name;
	private int age;
	private String Department;

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

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", Department=" + Department + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Department == null) ? 0 : Department.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Department == null) {
			if (other.Department != null)
				return false;
		} else if (!Department.equals(other.Department))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compare(Employee o1, Employee o2) {

	    int nameInt = o1.getName().compareTo(o2.getName());  
		int dept = o1.getDepartment().compareTo(o2.getDepartment());

		if (o1.getAge() < o2.getAge()) {

			return -1;
		}

		else if (o1.getAge() > o2.getAge()) {

			return 1;
		}

		else if (nameInt < 0) {
			return -1;
		} else if (nameInt > 0) {
			return 1;
		}

		else if (dept < 0) {
			return -1;
		} else if (dept > 0) {
			return 1;
		}
		return 0;

	}



}
