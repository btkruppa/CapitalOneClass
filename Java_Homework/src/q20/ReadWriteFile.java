package q20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class ReadWriteFile {


	public static void main(String[] args) {
		
		writeObjectToFile();
		readObjectFromFile();
		
		}
	
	private static void writeObjectToFile(){
		WriteFile wf1 = new WriteFile("Mickey:","Mouse:", 35,"Arizona");
		WriteFile wf2 = new WriteFile("Hulk:","Hogan:", 50,"Virginia");
		WriteFile wf3 = new WriteFile("Roger:","Rabbit:", 22,"California");
		WriteFile wf4 = new WriteFile("Wonder:","Woman:", 18,"Montana");
		
		List <WriteFile> list = new LinkedList<WriteFile>();
		list.add(wf1);
		list.add(wf2);
		list.add(wf3);
		list.add(wf4);
		
	
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))) {
			for(WriteFile data: list) {
				bw.write(data.getFirstName()+":"+data.getLastName()+":"+data.getAge()+":"+data.getState());
				bw.newLine();
			}
			bw.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static void readObjectFromFile() {
		List<String> writeDetails = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
			for(int i= 1; i<=4;i++)
			{
				writeDetails.add(br.readLine());
			}
				
			for(String str : writeDetails )
			{
				int firstIndex = str.indexOf(':');
				int secondIndex = str.indexOf(':',str.indexOf(':') + 1 );
				int thirdIndex = str.indexOf(':',secondIndex + 1 );
				int fourthIndex = str.indexOf(':',thirdIndex + 1 );

			
				System.out.println("First Name : " + str.substring(0,firstIndex));
				System.out.println("Last Name : " + str.substring(firstIndex+1, secondIndex)); 
				System.out.println("Age : " + str.substring(secondIndex+1, thirdIndex));
				System.out.println("State : " + str.substring(fourthIndex));
				
				System.out.println("****************************");
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}
