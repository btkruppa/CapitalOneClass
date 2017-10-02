package com.capitalone.revature.week1.q7;

public class EmployeeData {

	private String name;
	private int department;
	private int age;

	public EmployeeData() {
		super();
	}

	public EmployeeData(String name, int department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", department=" + department + ", age=" + age + "]";
	}
}
