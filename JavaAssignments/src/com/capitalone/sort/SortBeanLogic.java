package com.capitalone.sort;


public class SortBeanLogic {
	private String name;
	private int age;
	private String dept;
	
	public SortBeanLogic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SortBeanLogic(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "SortBeanLogic [name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}


	
	
	
}
