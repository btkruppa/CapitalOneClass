package com.capital.one.inheritance;

import com.capital.one.animals.Cat;
import com.capital.one.animals.Life;

public class Driver {
	public static void main(String[] args) {
//		Life myCat = new Cat("pinky", 10.5f);
//		
		
		TestClass tc = new TestClass();
		tc.myMethod();
	}
	
	public static void checkLives(Life[] lives) {
		for(Life life: lives) {
			life.isAlive();
		}
	}

}
