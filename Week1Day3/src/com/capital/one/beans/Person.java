package com.capital.one.beans;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8212870105088963280L;

	private String name;
	private int age;
	private String gender;

	private transient String ssn;

	public Person(String name, int age, String gender, String ssn) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ssn = ssn;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", ssn=" + ssn + "]";
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
