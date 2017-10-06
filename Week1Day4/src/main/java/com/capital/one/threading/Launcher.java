package com.capital.one.threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Launcher {
	public static void main(String[] args) {
		// Thread currentThread = Thread.currentThread();
		// System.out.println(currentThread.getName());
		//
		// ProducerThread producer = new ProducerThread();
		//
		// Thread thread0 = new Thread(producer);
		//
		// System.out.println(thread0.getName());
		// System.out.println("thread is alive: " + thread0.isAlive());
		// thread0.start();
		//
		// System.out.println("thread is alive: " + thread0.isAlive());
		// try {
		// thread0.join();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// System.out.println("joined");
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);

		ProducerThread producer = new ProducerThread(bq);
		Thread produce = new Thread(producer);

		ConsumerThread ct = new ConsumerThread(bq);
		ct.start();

		produce.start();

	}
}
