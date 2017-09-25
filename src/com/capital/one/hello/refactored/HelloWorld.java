package com.capital.one.hello.refactored;

import java.time.LocalTime;

import com.capital.one.objects.refactored.School;

public class HelloWorld {

	// whole number
	byte b; // 8 bits signed
	short s; // 16 bits signed
	char c; // 16 bits unsigned
	int i; // 32 bits signed
	long l; // 64

	// decimal values
	float f; // 32 bits 1 bit is for sign, 8 bits are exponent and 23 bits of significance
	double d; // 64 bits 1 bit sign, 11 bits exponent, 52 bits of significance

	boolean bool; // true or false

	public static void main(String[] args) {
		System.out.println("Hello World!!!!");

		System.out.println(School.getStartTime());

		School mySchool = new School(800, 10, 13);
		School otherschool = new School(5);

		System.out.println("static: " + School.getStartTime());
		System.out.println("mySchool: " + mySchool.getStartTime());
		System.out.println("otherschool: " + otherschool.getStartTime());

		mySchool.setStartTime(LocalTime.now());

		System.out.println("static: " + School.getStartTime());
		System.out.println("mySchool: " + mySchool.getStartTime());
		System.out.println("otherschool: " + otherschool.getStartTime());

	}

}
