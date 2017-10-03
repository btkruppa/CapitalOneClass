package com.q07.comparator.sorting;

public class Employee {

	private String name;
	private int departmentNumber;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", departmentNumber=" + departmentNumber + ", age=" + age + "]";
	}

	public Employee(String name, int departmentNumber, int age) {
		super();
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.age = age;
	}

}
