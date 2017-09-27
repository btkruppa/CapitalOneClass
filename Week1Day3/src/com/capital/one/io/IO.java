package com.capital.one.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO {
	public static void main(String[] args) {
		// fileOutputStream();
		// fileInputStream();

		// fileWritter();
//		 fileReader();

		 bufferedWritter();
//		 bufferedReader();
		
		scanner();

	}
	
	private static void scanner() {
		Scanner scan;
		try {
			scan = new Scanner(new File("src/com/capital/one/io/IO.java"));
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void bufferedReader() {
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private static void bufferedWritter() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("main/resources/test.txt"))) {
			bw.write("hello");
			bw.newLine();
			bw.write("world");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void fileWritter() {

		try (FileWriter fw = new FileWriter("test.txt")) {
			fw.write("hello");
			fw.write("hello");
			fw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void fileReader() {
		try {
			FileReader fr = new FileReader("test.txt");
			System.out.println((char) fr.read());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static void fileInputStream() {
		try (FileInputStream fis = new FileInputStream("test.txt")) {

			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void fileOutputStream() {
		try (FileOutputStream fos = new FileOutputStream("test.txt")) { // try with resources
			fos.write(0);
			fos.write(1);
			fos.write(10);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
