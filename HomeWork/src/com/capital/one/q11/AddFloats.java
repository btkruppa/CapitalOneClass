package com.capital.one.q11;

import com.capital.one.qeleven.FloatVariables;

public class AddFloats {

	public static void main(String[] args) {

		FloatVariables fl = new FloatVariables();

		fl.setA(2.3f);
		fl.setB(5.4f);

		System.out.println("Result of adding 2 float numbers is " + (fl.getA() + fl.getB()));

	}

}
