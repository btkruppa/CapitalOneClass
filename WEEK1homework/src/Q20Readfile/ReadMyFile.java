package Q20Readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadMyFile {

	public static void main(String[] args) {
		readfile();

	}

	private static void readfile() {
		try (BufferedReader br = new BufferedReader(new FileReader("/Users/miu834/Documents/workspace/java/WEEK1homework/src/Q20Readfile/Data.txt"))) {
			String temp =br.readLine();
			temp.split(":");
			String [] a=temp.split(":");
			
			System.out.println("Name :"+a[0]+ " "+ a[1]);
			System.out.println("Age :"+a[2] +" Years");
			System.out.println("State :"+a[3] + " State");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
