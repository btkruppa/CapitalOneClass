package com.capital.one.assigment7.comparator;

public class EmployeeData {
	
	String name;
	int department;
	int age;
	public EmployeeData() {
		super();
		// TODO Auto-generated constructor stub
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
