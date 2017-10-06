package com.capital.one.inheritance;

public interface ExampleInterface {
	default void myMethod() {
		System.out.println("methodCalled");
	}
}
