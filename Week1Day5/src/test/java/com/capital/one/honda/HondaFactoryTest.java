package com.capital.one.honda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capital.one.beans.Car;
import com.capital.one.factory.example.HondaFactory;

public class HondaFactoryTest {
	private static HondaFactory hf;
	private Car testCar;

	@BeforeClass
	public static void runOnceBeforeClass() {
		HondaFactory hf = new HondaFactory();
		System.out.println("@BeforeClass - runOnceBeforeClass");
	}

	@AfterClass
	public static void runOnceAfterClass() {
		System.out.println("@AfterClass - runs once after class");
	}

	@Before
	public void beforeTestMethods() {
		System.out.println("@Before - runs before every @Test");
		testCar = new Car("honda", 2017, "civic", "blue");

	}

	@After
	public void afterTestMethods() {
		System.out.println("@After - runs after every @Test");
	}

	@Test
	public void testCivicNotNull() {
		assertNotNull("We expected a civic and got null", hf.getCar("civic", null));
	}

	@Test
	public void testTacomaNull() {
		assertNull("Honda factories can't make tacomas", hf.getCar("tacoma", "blue"));
	}

	@Test(expected = Exception.class)
	public void expectExceptionTest() throws Exception {

	}

	@Test
	public void testCivicIsBlue() {
		Car c = hf.getCar("civic", "blue");
		assertEquals("blue", c.getColor());
	}

	@Test
	public void testAccordNotNull() {
		assertNotNull("We expect an accord and got null", hf.getCar("accord", "red"));
	}

	@Test
	public void test() {

	}

}
