package com.capital.one.threading;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread extends Thread {
	private BlockingQueue<Integer> producedQueue;

	public ConsumerThread(BlockingQueue<Integer> producedQueue) {
		super();
		this.producedQueue = producedQueue;
	}

	@Override
	public void run() {
		int taken;
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
				taken = producedQueue.take();
				System.out.println("consumed: " + taken);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
