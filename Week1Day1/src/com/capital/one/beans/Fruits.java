package com.capital.one.beans;

public class Fruits implements Comparable<Fruits> {

	private String name;
	private int taste;

	public Fruits(String name, int taste) {
		super();
		this.name = name;
		this.taste = taste;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaste() {
		return taste;
	}

	public void setTaste(int taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + ", taste=" + taste + "]";
	}

	public int compareTo(Fruits o) {
		// TODO Auto-generated method stub
		return o.getTaste() - this.getTaste();

	}

}
