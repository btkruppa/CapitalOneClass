package com.capital.one.lambdas;

public class NonLambdaThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("non lambda thread");
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
