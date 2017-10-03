package com.q15.add.sub.mult.div;

public class TestClass extends Calculator {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		cal.add(20, 55);
		cal.add(23, 43, 565, 142, 65, 87);
		cal.sub(50, 77);
		cal.multiplication(21, 34);
		cal.div(89, 24);
	}

}
