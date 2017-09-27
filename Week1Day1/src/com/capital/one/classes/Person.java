package com.capital.one.classes;

public class Person {
	private String name;
	private long id;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
