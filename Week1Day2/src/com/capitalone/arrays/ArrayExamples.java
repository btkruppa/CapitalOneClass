package com.capitalone.arrays;

import com.capitalone.com.animals.Animal;
import com.capitalone.com.animals.Cat;
import com.capitalone.com.animals.Dog;

public class ArrayExamples {
	public static void main(String[] args) {
//		int[] myArr = new int[5];
//		myArr[3] = 3;
//		System.out.println(myArr[3]);
//		myArr[3] = -1;
//		System.out.println(myArr[3]);
//		myArr[3] = 10;
//		System.out.println(myArr[3]);
//
//		for (int i = 0; i < myArr.length; i++) {
//			System.out.println(myArr[i]);
//		}
//		
//
//		for (int y : myArr) {
//			System.out.println(y);
//
//		}
		
		Animal[] myPets = new Animal[3];
		myPets[0] = new Cat();
		myPets[0] = new Dog();
		
		
		for(Animal pet :myPets){
			pet.feed();
		}
		
	}

}
