package com.q16.string.command.line.argument;

public class CommandLineString {
	
	public static void main(String[] args) {
		
		int i=0;
		
		for (String s : args) {
			
			i = i + s.length();
			
//			System.out.println(s);
			
			}
		
		System.out.println("Number of Characters in the string are " + i);
		
	}

}
