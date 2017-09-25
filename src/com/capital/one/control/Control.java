package com.capital.one.control;

import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		// forLoop();
		// whileLoop();
		// doWhileLoop();
		// switchExample(5);
		// switchExample(3);
		// ternary(100);

	}

	private static void ternary(int i) {

		// System.out.print("the number is ");
		// if(i > 100) {
		// System.out.println("large");
		// } else {
		// System.out.println("small");
		// }

		System.out.println("the number is " + ((i > 100) ? "large" : "small"));

		// don't nest ternaries, it gets messy fast
		// System.out.println("the number is " + ((i > 100) ? (i > 1000)? "very large"
		// :"large" : "small"));
	}

	private static void switchExample(int i) {
		switch (i) {
		case 1:
			System.out.println("case 1");
			break;

		case 5:
			System.out.println("case 5");
			break;

		case 4:
			System.out.println("case 4");
			break;

		default:
			System.out.println("default");
			break;
		}
	}

	public static void forLoop() {
		System.out.println("Testing for loop");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("for loop done");
	}

	public static void whileLoop() {
		System.out.println("Testing while loop");
		Scanner scan = new Scanner(System.in);
		String choice = null;

		System.out.println("Enter \"quit\" to not start:");
		choice = scan.nextLine();

		// can potentially never enter since it evaluates the condition at the start of
		// the block
		outer: while (true) {
			System.out.println("loop outer");
			System.out.println("Enter \"quit\" to exit:");
			inner: while (true) {
				System.out.println("loop inner");
				choice = scan.nextLine();
				if (choice.equals("exit")) {
					break;
				} else if (choice.equals("quit")) {
					break outer;
				}
			}

		}

	}

	public static void doWhileLoop() {
		System.out.println("Testing while loop");
		Scanner scan = new Scanner(System.in);
		String choice;

		do { // always happens at least once since the condition is evaluated at the end of
				// the block
			System.out.println("Enter \"quit\" to exit:");
			choice = scan.nextLine();
			System.out.println(choice.equals("quit"));
		} while (!"quit".equals(choice));

		System.out.println("done with while");
	}

}
