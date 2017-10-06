package com.capital.one.factory.example;

import com.capital.one.beans.Car;

public class HondaFactory {

	public Car getCar(String whatCar, String color) {
		if ("civic".equals(whatCar)) {
			return new Car("honda", 2017, "civic", color);
		} else if ("crv".equals(whatCar)) {
			return new Car("honda", 2017, "crv", color);
		}

		return null;
	}
}
