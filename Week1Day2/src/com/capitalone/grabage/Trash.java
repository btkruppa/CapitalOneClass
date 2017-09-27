package com.capitalone.grabage;

public class Trash {
	
private int id;

public Trash(int i) {
	super();
	// TODO Auto-generated constructor stub
}


public int getId(int id) {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(id);
	}

}


