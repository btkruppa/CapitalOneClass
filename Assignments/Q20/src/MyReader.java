import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyReader {

	public static void main(String[] args) throws FileNotFoundException {

		//Establish Buffered Reader Object for file read
		BufferedReader br = new BufferedReader(
				new FileReader("/Users/nom478/Documents/workspace-sts-3.9.0.RELEASE/Q20/src/Data.txt"));

		//Use this string to hold individual records, or lines, from the input file
		String myString = null;
		// Establish your delimiter
		String delimiter = ":";
		
		//Used to hold the attributes of each Person Object
		String [] peopleAttributes = null;
		
		//Define an ArrayList of People Objects
		List<Person> myPeople = new ArrayList<Person>();
		

		try {
			// Loop through the Input file and store each line in myString
			while ((myString = br.readLine()) != null) {
				
				//Create a Person object
				Person thisPerson = new Person();
				
				//Delimit the input line and store in String Array peopleAttributes
				peopleAttributes = myString.toString().split(delimiter);
				
				//Set the attributes of the person object
				thisPerson.setFirstName(peopleAttributes[0]);
				thisPerson.setLastName(peopleAttributes[1]);
				thisPerson.setAge(peopleAttributes[2]);
				thisPerson.setState(peopleAttributes[3]);
				
				//Add the newly created Person to the myPeople ArrayList of Person objects
				myPeople.add(thisPerson);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//For each one of the Person objects stored in the myPeople Array List output the attributes
		for(Person x : myPeople) {
			System.out.println("Name: " + x.getFirstName() + " " + x.getLastName());
			System.out.println("Age: " + x.getAge());
			System.out.println("State: " + x.getState() + " State");
			System.out.println("");
		}
		
	}
}
