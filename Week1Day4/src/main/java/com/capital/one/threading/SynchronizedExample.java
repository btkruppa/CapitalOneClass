package com.capital.one.threading;

public class SynchronizedExample {
	public synchronized void myMethod() {
		System.out.println(Thread.currentThread().getName() + "Has actually started the method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
