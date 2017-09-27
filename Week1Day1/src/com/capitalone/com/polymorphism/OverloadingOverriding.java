package com.capitalone.com.polymorphism;

public class OverloadingOverriding extends Parents {

	
	public static void main(String[] arg) {
		OverloadingOverriding testing = new OverloadingOverriding();

		testing.overloaded(1);
		testing.overwritten(1);

	}

	@Override
	public void overwritten(int i) {
		System.out.println("child");

	}

	public void overloaded(int i) {
		System.out.println("inti");
	}

	public void overloaded(long l) {
		System.out.println("long l");
	}

	public void overloaded(int i, long l) {
		System.out.println("multi");
	}

	public void overloaded(Integer i) {
		System.out.println("INTeger i");
	}

}
