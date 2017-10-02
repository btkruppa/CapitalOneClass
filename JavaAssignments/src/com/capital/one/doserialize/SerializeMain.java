package com.capital.one.doserialize;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SerializeMain {
	public static void main(String[] args) {
		List<SerializeCorebean> coreBean = new ArrayList<SerializeCorebean>();
		coreBean.add(new SerializeCorebean("Micky","Mouse",25,"Arizona"));
		coreBean.add(new SerializeCorebean("Hulk","Hogan",50,"Virginia"));
		coreBean.add(new SerializeCorebean("Roger","Rabbit",22,"California"));
		coreBean.add(new SerializeCorebean("Wonder","Women",18,"Montana"));
		writeObjectStudent(coreBean);
		readObjectStudent();
		
	}
	public static void writeObjectStudent(List<SerializeCorebean> coreBean) {
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Data.txt"));
			os.writeObject(coreBean);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void readObjectStudent() {
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Data.txt"));
			try {
				List<SerializeCorebean> result = (List<SerializeCorebean>) is.readObject();
				for(SerializeCorebean each : result) {
					System.out.println("Name :" + each.getAnimalName()+" " + each.getAnimalPair());
					System.out.println("Age : "+ each.getAge());
					System.out.println("Place :"+ each.getPlace());
				}
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
}
