package com.capitalone.q7;

public class Employee {
	private String name;
	private String Department;
	private int age;

	public Employee(String name, String department, int age) {
		super();
		this.name = name;
		Department = department;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Department=" + Department + ", age=" + age + "]";
	}

}
