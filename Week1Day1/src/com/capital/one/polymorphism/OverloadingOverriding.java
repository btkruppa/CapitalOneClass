package com.capital.one.polymorphism;

public class OverloadingOverriding extends Parent {
	
	public static void main(String[] args) {
		OverloadingOverriding testing = new OverloadingOverriding();
		testing.overloaded(new Integer(1), 1);
		testing.overwritten(1);
	}

	@Override
	public void overwritten(int i) {
		System.out.println("child");
	}

	public void overloaded(int i) {
		System.out.println("int i");
	}

	public void overloaded(long i) {
		System.out.println("long i");
	}

	public void overloaded(int i, long l) {
		System.out.println("multiple params");
	}

	public void overloaded(Integer i) {
		System.out.println("Integer i");
	}

}
