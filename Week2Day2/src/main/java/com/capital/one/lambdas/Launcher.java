package com.capital.one.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Launcher {
	public static void main(String[] args) throws InterruptedException {
		List<String> myList = new ArrayList<String>();
		myList.add("hello");
		myList.add("longer string");
		myList.add("s");
		myList.add("goodbye");

		Collections.sort(myList, (one, two) -> {
			return one.length() - two.length();
		});

		System.out.println(myList);

		// // (String param1) -> { });
		// Thread lambdaThread = new Thread(() -> {
		// while(true) {
		// System.out.println("lambda thread");
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// });
		//
		// Thread nonLambdaThread = new Thread(new NonLambdaThread());
		// nonLambdaThread.start();
		//
		// lambdaThread.start();
		//
		// while(true) {
		// System.out.println("main thread");
		// Thread.sleep(700);
		// }

		Thread nonAnnymousClassThread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
		});
	}
}
