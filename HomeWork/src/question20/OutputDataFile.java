package question20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OutputDataFile {

	public static void main(String[] args) throws IOException {

		String filePath = "/Users/jhy409/Documents/workspace/HomeWork/src/question20/Data.txt";
		BufferedReader read = new BufferedReader(new FileReader(filePath));

		String line;
		while ((line = read.readLine()) != null) {
			String[] values = line.split(":");
			// System.out.println(values[0]);
			System.out.println("Name: " + values[0] + " " + values[1] + "\n" + "Age: " + values[2] + " years" + "\n"
					+ "State: " + values[3] + " State");
		}
		read.close();
	}

}
