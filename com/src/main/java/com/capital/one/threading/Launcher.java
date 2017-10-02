package com.capital.one.threading;

public class Launcher {
	public static void main(String[] args) {
		
		Thread ct = Thread.currentThread();
		ProducerThread producer = new  ProducerThread();
		
		Thread thread = new Thread(producer);
		thread.start();
		System.out.println(thread);
		
		
	}

}
