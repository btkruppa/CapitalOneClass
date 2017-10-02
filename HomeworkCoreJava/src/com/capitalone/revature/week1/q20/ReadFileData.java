// Read from a file and print the format output

package com.capitalone.revature.week1.q20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileData {
	public static void main(String[] args) {
		// Reads the file input as Buffer
		try (BufferedReader br = new BufferedReader(new FileReader("src/com/capitalone/revature/week1/q20/data.txt"))) {
			formatData(br);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	// Formats File Input read
	private static void formatData(BufferedReader br) throws IOException {
		for (int i = 0; i < 4; i++) {
			String[] lineRead = br.readLine().split(":");

			System.out.println("Name: " + lineRead[0] + " " + lineRead[1]);
			System.out.println("Age: " + lineRead[2] + " years");
			System.out.println("State: " + lineRead[3] + " State \n");
		}
	}
}
