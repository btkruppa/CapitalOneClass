package com.capital.one.arrays;

import com.capital.one.animals.Animal;
import com.capital.one.animals.Cat;
import com.capital.one.animals.Dog;

public class ArrayExamples {

	public static void main(String[] args) {
		// int[] myArr = new int[7]; // 5 is the size
		// myArr[3] = 2;
		// // System.out.println(myArr[3]);
		// myArr[3] = -1;
		// // System.out.println(myArr[3]);
		//
		//// for (int i = 0; i < myArr.length; i++) {
		//// System.out.println(myArr[i]);
		//// }
		//
		// for (int someElement : myArr) {
		// System.out.println(someElement);
		// }

		Animal[] myPets = new Animal[3];
		myPets[0] = new Cat();
		String s = "hello";
		System.out.println(s.substring(1, 4));
		myPets[1] = new Dog();
		myPets[2] = new Dog();

		for (Animal pet : myPets) {
			pet.feed();
		}
	}
}
