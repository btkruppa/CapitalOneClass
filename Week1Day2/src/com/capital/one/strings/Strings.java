package com.capital.one.strings;

public class Strings {
	public static void main(String[] args) {
//		stringExamples();
		
		stringBuilderBuffer();
		
		
	}
	
	public static void stringExamples() {
		String s = "hello";
		String t = s + " world";
		String v = "hello world";
//		t = t.intern(); // takes a string on the heap and puts it in the string pool
		
		System.out.println(v == t);
		System.out.println(v.equals(t));
		
//		System.out.println("hello".equals(s)); // safer than the one below
//		System.out.println(s.equals("hello"));
	}
	
	public static void stringBuilderBuffer() {
		
		StringBuilder sbr = new StringBuilder("hello");
		sbr.append(" world");
		System.out.println(sbr);
	}
}
