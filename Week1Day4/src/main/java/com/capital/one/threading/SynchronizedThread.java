package com.capital.one.threading;

public class SynchronizedThread implements Runnable {
	
	private SynchronizedExample se;

	public SynchronizedThread(SynchronizedExample se) {
		this.se = se;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is calling method from thread class");
		se.myMethod();
		System.out.println(Thread.currentThread().getName() + " is done");
	}

}
