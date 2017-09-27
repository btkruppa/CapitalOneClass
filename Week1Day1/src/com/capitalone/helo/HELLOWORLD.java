package com.capitalone.helo;

import java.time.LocalDateTime;
import java.time.LocalTime;

import com.capitalone.objects.School;

public class HELLOWORLD {

	public static void main(String[] arg) {

		byte b; // 8bits signed
		short s; // 16bits signed
		char c; // 16bits unsigned
		int i; // 32 bits signed
		long l; // 64 bits

		// decimal values
		float f; // 32 bits 1 bit for sign, 8 bits are exponent and 23 bits of
					// significance
		double d; // 64 bits 1 bit sign, 11 bits exponent, 52 bits of
					// significance

		boolean bool; // true or false

		System.out.println("Hello World!!!");

		School mySchool = new School(10, 10, 10);
		System.out.println(mySchool.getNumberBooks());
	
		mySchool.startSchool(LocalDateTime.now());
		School.setStarttime(LocalTime.now());
		

	}

}
