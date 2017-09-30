package com.capital.one.threading;

public class SynchronizedLauncher {
	public static void main(String[] args) throws InterruptedException {
		SynchronizedExample se = new SynchronizedExample();

		SynchronizedThread st = new SynchronizedThread(se);

		Thread thread0 = new Thread(st);
		Thread thread1 = new Thread(st);

		thread0.start();
		thread1.start();
		Thread.sleep(1500);
		System.out.println(thread0.getName() + " " + thread0.getState());
		System.out.println(thread1.getName() + " " + thread1.getState());

		Thread.sleep(6000);
		System.out.println(thread0.getName() + " " + thread0.getState());
		System.out.println(thread1.getName() + " " + thread1.getState());

	}
}
