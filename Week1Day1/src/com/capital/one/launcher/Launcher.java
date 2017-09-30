package com.capital.one.launcher;

import com.capital.one.classes.Person;

public class Launcher {
	public static void main(String[] args) {
		Person uday = new Person("Uday", 1);
		Person blake = new Person("Blake", 2);
		Person p = new Person();
		
		String s1 = "cat";
		String s2 = "c";
		s2 += "at";
		System.out.println(s1 + s2);
		s2 = s2.intern();
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
