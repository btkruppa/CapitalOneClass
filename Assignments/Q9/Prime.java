package Q9;

import java.util.ArrayList;
import java.util.List;

public class Prime {

	public static void main(String[] args) {
		
		//Since int cannot be stored in Array List define an ArrayList of Integers
		List<Integer> myList = new ArrayList<Integer>();
		
		//Define a conventional int array and populate it in following loop
		int myArr[] = new int[100];
		
		for (int i = 0; i < 100; i++) {
			myArr[i] = i + 1;
		}
		
		//Define Integer Array
		Integer[] newArray = new Integer[100];
		int i = 0;
		
		//Move contents of int array to Integer Array
		for (int value : myArr) {
			
			newArray[i++] = Integer.valueOf(value);
		}
		
		// Move all Integers to Array List
		for (Integer whatever : newArray) {
			myList.add(whatever);
			
		}
				
	}
}
