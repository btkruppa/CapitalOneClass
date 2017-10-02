import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// Establish ArrayList of Integers
		ArrayList<Integer> numbers = new ArrayList<Integer>(10);
		int even = 0;
		int odd = 0;
		
		List<Integer> notPrimeNumbers = new ArrayList<Integer>();
		
		//Populate ArrayList variable numbers with integers
		for (int i = 1; i <= 10; i++)
		{
		   numbers.add(i);
		}
		
		//Loop through the ArrayList and make a running total for even and odd numbers
		for (int x = 0; x < 10; x++) {
			
			if(x % 2 == 0) {
				even = even + x;
			}
			
			if(x % 2 == 1) {
				odd = odd + x;
			}
			
			//Check to see if number is NOT Prime by calling isPrime
			//If not Prime add to Array LIst of Integers containing numbers which are not prime
			if(isPrime(numbers.get(x))) {
				
				notPrimeNumbers.add(numbers.get(x));
			}
		}
		
		//Sysout the even and odd totals for numbers in numbers ArrayList
		System.out.println("Even total is: " + even);
		System.out.println("Odd total is: " + odd);	
		
		// For every number that is not prime (i.e. in notPrimeNumbers ArrayList of Integers)
		// remove that number from the numbers ArrayList so that list contains only non Prime Numbers
		for(Integer x : notPrimeNumbers) {
			numbers.remove(x);
		}
		
		System.out.println("Here's the ArrayList without Prime numbers: " + numbers.toString());
		
	}
	
	//Function to see if number passed is a Prime number. Returns boolean
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
