package com.capitalone.stringmanipulation;

public class StringFindBean {
	private String newWorld;
	private int index;
	
	public StringFindBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StringFindBean(String newWorld, int index) {
		super();
		this.newWorld = newWorld;
		this.index = index;
	}

	@Override
	public String toString() {
		return "StringFindBean [newWorld=" + newWorld + ", index=" + index + "]";
	}

	public String getNewWorld() {
		return newWorld;
	}

	public void setNewWorld(String newWorld) {
		this.newWorld = newWorld;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public void getString(String str, int index) {
		this.newWorld = str;
		this.index = index;
		for(int i=0; i<index; i++) {
			System.out.println(newWorld.charAt(i));
		}
	}
	
}
