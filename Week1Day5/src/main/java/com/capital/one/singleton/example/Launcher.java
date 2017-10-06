package com.capital.one.singleton.example;

public class Launcher {
	public static void main(String[] args) {
		OurSingleton os = OurSingleton.getInstance();

		OurSingleton again = OurSingleton.getInstance();

		System.out.println(os == again);

		os.writeFile("hello");
		os.readFile();
		
		again.readFile();
		again.writeFile("again");
	}
}
