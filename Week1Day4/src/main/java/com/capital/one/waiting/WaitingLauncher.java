package com.capital.one.waiting;

public class WaitingLauncher {
	public static void main(String[] args) throws InterruptedException {
		WaitingThread wt = new WaitingThread(Thread.currentThread());

		Thread th = new Thread(wt);
		th.start();

		Thread.sleep(2000);

		System.out.println(th.getState());
		
		
		// terminated thread example
		Thread term = new Thread(wt);
		term.start();

	}
}
