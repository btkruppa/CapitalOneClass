package com.q20.file.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadAndWrite {

	public static void main(String[] args) throws FileNotFoundException {

		

		String str;
		try (BufferedReader br = new BufferedReader(new FileReader("Data.txt"));) {
			str = br.readLine();

			while (str != null) {

				int i;

				System.out.print("Name: " + str.substring(0, i = str.indexOf(":", 0)));

				System.out.println(" " + str.substring(i + 1, i = str.indexOf(":", i + 1)));

				System.out.println("Age: " + str.substring(i + 1, i = str.indexOf(":", i + 1)) + "years");

				System.out.println("State: " + str.substring(i + 1) + " State");

				str = br.readLine();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
