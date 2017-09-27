package com.capital.one.inheritance;

import com.capital.one.grabage.ExampleInterface2;

public class TestClass implements ExampleInterface, ExampleInterface2 {
	public void otherMethod() {
		myMethod();
	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		ExampleInterface2.super.myMethod();
	}

}
