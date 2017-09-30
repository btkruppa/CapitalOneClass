import java.util.ArrayList;
import java.util.List;

public class Prime {

	public static void main(String[] args) {
		
		// The below code seems overly verbose.....am learning
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
		
		// Check if each value in myList ArrayList of Integers is Prime and sysout
		for (int i1 = 1; i1 < 100; i1++) {
			boolean check = isPrime(myList.get(i1));
			if (check) {
				System.out.println(myList.get(i1));
			}
			
			}
		}
		
	// Accept integer parameter and perform prime number check. return true if so
		static boolean isPrime (int parm) {
		
			    int z;
			    for (z = 2; z <= parm / 2; z++)  {
			        if (parm % z == 0) {
			            return false;
			        }
			    }
			    return true;
			}
					
	}

