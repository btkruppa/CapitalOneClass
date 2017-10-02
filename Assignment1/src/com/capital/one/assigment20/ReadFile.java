package com.capital.one.assigment20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("src/com/capital/one/assigment20/abc.txt"))) {
			formatData(br);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void formatData(BufferedReader br) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			String[] lineRead;
			try {
				lineRead = br.readLine().split(":");
				System.out.println("Name: " + lineRead[0] + " " + lineRead[1]);
				System.out.println("Age: " + lineRead[2] + " years");
				System.out.println("State: " + lineRead[3] + " State \n");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}