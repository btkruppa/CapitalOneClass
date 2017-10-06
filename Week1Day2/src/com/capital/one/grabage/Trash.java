package com.capital.one.grabage;

public class Trash {
	private int id;

	public Trash(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("trash removed with id " + id);
	}
}
