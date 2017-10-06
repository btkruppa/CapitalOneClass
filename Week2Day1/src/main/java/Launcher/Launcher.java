package Launcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import OtherPackage.OtherClass;
import OtherPackage.OtherClass.InnerClass;

public class Launcher {
	static Logger log = Logger.getRootLogger();
	static {
		System.out.println("launcher static");
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main started");
		OtherClass oc = new OtherClass();
		InnerClass ic = oc.doSomething();
		System.out.println("after other class");

		int i = 5;

		Thread t = new Thread(() -> {
			while (true) {
				System.out.println("lambda thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t.start();

		while (true) {
			System.out.println("main");
			Thread.sleep(900);
			List<String> li = new ArrayList<String>();
			
			li.add("goodbye");
			li.add("hello");
			li.add("random long string");
			li.add("s");

			Collections.sort(li, (String one, String two) -> {
				return one.length() - two.length();
			});
			
			List<String> sublist = li.parallelStream()
					.filter(element -> element.length() <= 5 ? true : false)
					.collect(Collectors.toList());
			
			System.out.println(li);
			System.out.println(sublist);
		}
	}

	static {
		System.out.println("second static");
	}

}
