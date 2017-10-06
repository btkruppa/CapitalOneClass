package com.capital.one.threading;

import java.util.concurrent.BlockingQueue;

public class ProducerThread implements Runnable {
	private BlockingQueue<Integer> producedQueue;

	public ProducerThread(BlockingQueue<Integer> producedQueue) {
		super();
		this.producedQueue = producedQueue;
	}

	@Override
	public void run() {
		System.out.println("Thread started and is running");

		for (int i = 0; i < 100; i++) {
			System.out.println("Produced: " + i);
			producedQueue.add(i);
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("done");
	}

}
