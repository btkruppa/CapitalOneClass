package com.capital.one.week1hw.Q7;

public class Employee {

	private String employeeName;
	private String department;
	private int  age;
	
	
	public Employee(String employeeName, String department, int age) {
		super();
		this.employeeName = employeeName;
		this.department = department;
		this.age = age;
	}
	

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
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
		return "Employee [employeeName=" + employeeName + ", department=" + department + ", age=" + age + "]\n";
	}

}
