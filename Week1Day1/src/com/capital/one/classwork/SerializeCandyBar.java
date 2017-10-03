package com.capital.one.classwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ReadOnlyBufferException;

public class SerializeCandyBar {
	
	public static void main(String[] args){
		
		CandyBar Twix = new CandyBar();
writeObjectCandy(Twix);
ReadObjectCandy();
}

	private static void ReadObjectCandy() {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Twix.txt"));
			try {
				System.out.println(is.readObject());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeObjectCandy(CandyBar twix) {
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Twix.txt"));
			os.writeObject(twix);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
