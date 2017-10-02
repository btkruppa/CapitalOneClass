package com.capitalone.q20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q20 {

	

	public static void main(String[] args) {
		
	//	bufferedWritter();
		bufferedReader();
		

	}

	private static void bufferedWritter(){
		Person p1 = new Person("John", "Berlin", "Virginia", 44);
		Person p2 = new Person("Steve", "Richmond", "NewYork", 66);
		Person p3 = new Person("Dylan", "Jersy", "NewJersy", 32);
		Person p4 = new Person("Dayana", "Boost", "Chicago", 37);
		
		Set <Person> dataSet = new HashSet<Person>();
		dataSet.add(p1);
		dataSet.add(p2);
		dataSet.add(p3);
		dataSet.add(p4);
		
		// try with resources
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))) {
			for(Person data: dataSet) {
				bw.write(data.getfName()+":"+data.getlName()+":"+data.getAge()+":"+data.getState());
				bw.newLine();
			}
			bw.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void bufferedReader() {
		List<String> pdetails = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
			for(int i= 1; i<=4;i++)
			{
				pdetails.add(br.readLine());
			}
				
			for(String pdetailsinfo : pdetails )
			{
				//System.out.println(pdetailsinfo);
				int firstindex = pdetailsinfo.indexOf(':');
				//System.out.println("First index - " + firstindex);
				int secindex = pdetailsinfo.indexOf(':',pdetailsinfo.indexOf(':') + 1 );
				//System.out.println("Second index - " + secindex);
				int thirdindex = pdetailsinfo.indexOf(':',secindex + 1 );
				//System.out.println("Third index - " + thirdindex);
			
				System.out.println("Name : " + pdetailsinfo.substring(0,firstindex) + " " + pdetailsinfo.substring(firstindex+1,secindex));
				System.out.println("Age : " + pdetailsinfo.substring(secindex+1, thirdindex));
				System.out.println("State : " + pdetailsinfo.substring(thirdindex+1));
				
				System.out.println("-------------------------------------");
				
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	
}
