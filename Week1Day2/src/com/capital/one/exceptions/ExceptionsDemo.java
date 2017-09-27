package com.capital.one.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {
	public static void main(String[] args) {

		try {
			method2();
			method1();
			System.out.println("did not happen");
		} catch (IOException e) {
			System.out.println("io exception");
		} catch (Exception e) {
			System.out.println("exception");
		} finally {
			
		}
		System.out.println("still happened");

		// String s = null;
		// s.equals("hello");
		//
		//
		// System.out.println("doesn't happen");
	}

	public static void method1() throws Exception {
		throw new Exception();
	}

	public static void method2() throws IOException {
		throw new FileNotFoundException();

	}

	public static void method3() throws RuntimeException {

	}
}
