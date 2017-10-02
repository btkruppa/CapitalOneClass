package com.capital.one.q20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAFile {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File(
				"/Users/ins315/Documents/workspace/BootCampWeek1/HomeWork/src/com/capital/one/q20/Data.txt");
		Scanner scn = new Scanner(file);
		while (scn.hasNextLine()) {

			String line = scn.nextLine();
			String[] myArr1 = line.split(":");

			System.out.println("Name: " + myArr1[0] + " " + myArr1[1] + "\n" + " Age: " + myArr1[2] + " years" + "\n"
					+ " State: " + "Arizona State");

		}

	}

}
