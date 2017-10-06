package com.capital.one.waiting;

public class WaitingThread implements Runnable {
	private Thread th;

	public WaitingThread(Thread th) {
		super();
		this.th = th;
	}

	@Override
	public void run() {
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
