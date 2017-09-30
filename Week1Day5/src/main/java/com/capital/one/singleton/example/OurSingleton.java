package com.capital.one.singleton.example;

public class OurSingleton {
	private static final OurSingleton SINGLETON = new OurSingleton();

	private OurSingleton() {
		super();
	}

	public static OurSingleton getInstance() {
		return SINGLETON;
	}

	public synchronized void writeFile(String contents) {
		System.out.println("wrote to file");
	}

	public String readFile() {
		System.out.println("read file");
		return "read";
	}

}
