package Q7Comparator;

import java.util.Comparator;

//import Fruitbeans.Fruit;

public class Employee implements Comparator<Employee> {
	public String name;
	public String dpt;
	public int age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String dpt, int age) {
		super();
		this.name = name;
		this.dpt = dpt;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dpt == null) ? 0 : dpt.hashCode());
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
		if (age != other.age)
			return false;
		if (dpt == null) {
			if (other.dpt != null)
				return false;
		} else if (!dpt.equals(other.dpt))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dpt=" + dpt + ", age=" + age + "]\n";

	}

	@Override
	public int compare(Employee o1, Employee o2) {

		int n = o1.getName().charAt(0) - o2.getName().charAt(0);
		int m = o1.getDpt().charAt(0) - o2.getDpt().charAt(0);

		if (o1.getAge() > o2.getAge())

		{
			return -1;
		} else if (o1.getAge() < o2.getAge()) {
			return 1;
		} else if (n > 0) {
			return 1;
		} else if (n < 0) {
			return 1;
		} else if (m < 0) {
			return 1;
		} else if (m > 0) {
			return 1;
		} else
			return 0;

	}

}
