package com.captial.one.reflection;


import java.lang.annotation.Annotation;
import java.lang.reflect.*;

import com.capital.one.animals.Cat;

public class ReflectionDemo {
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		System.out.println("\tMethods");
		Class<Cat> catClass = Cat.class;
		Method[] methods = catClass.getMethods();
		for (Method m : methods) {
			System.out.println("\t\t" + m);
		}

		System.out.println("\tFields");
		Field[] fields = catClass.getDeclaredFields();
		for (Field f : fields) {
			System.out.println("\t\t" + f);
		}

		System.out.println("\tConstructors");
		Constructor<Cat>[] constructors = (Constructor<Cat>[]) catClass.getConstructors();
		for (Constructor c : constructors) {
			System.out.println("\t\t" + c);
		}

		System.out.println("\tAnnotations");
		Annotation[] ann = catClass.getAnnotations();
		for (Annotation a : ann) {
			System.out.println("\t\t" + a);
		}

		

		Field nameField = Cat.class.getDeclaredField("name");
		nameField.setAccessible(true);
		
		
		Cat myCat = new Cat("pinky", 10.5f);
		nameField.set(myCat, "simpson");
		

		System.out.println(myCat.getName());
		System.out.println(myCat.getWeight());
	}
}
