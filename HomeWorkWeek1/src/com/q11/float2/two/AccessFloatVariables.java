package com.q11.float2.two;

import com.q11.float1.one.FloatVariables;

public class AccessFloatVariables extends FloatVariables {

	public static void main(String[] args) {

		System.out.println("Static float variable: " + FloatVariables.f1);

		FloatVariables fv = new FloatVariables();

		System.out.println("Private Float variable: " + fv.getF2());

	}

}
