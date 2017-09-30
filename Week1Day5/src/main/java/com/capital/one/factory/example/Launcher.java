package com.capital.one.factory.example;

import com.capital.one.beans.Car;

public class Launcher {
	private static HondaFactory hf = new HondaFactory();

	public static void main(String[] args) {
		Car carOne = hf.getCar("crv", "gray");
		Car carTwo = hf.getCar("crv", "red");

		Car carThree = hf.getCar("civic", "white");

		System.out.println(carOne);
		System.out.println(carTwo);
		System.out.println(carThree);

	}
}
