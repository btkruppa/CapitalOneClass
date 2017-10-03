package q19;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIntegers {
	
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		int evenTotal = 0;
		int oddTotal = 0;

		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}

		System.out.println("Integer Values in ArrayList: " + numbers);

		for (int j : numbers) {

			if (j % 2 == 0) {
				evenTotal = evenTotal + j;
			} else {
				oddTotal = oddTotal + j;
			}
		}

		System.out.println("Even Numbers Total is: " + evenTotal);

		System.out.println("Odd Numbers Total is: " + oddTotal);
		
		System.out.println("Removing Prime Numbers and Printing numbers: ");
		
		ListIterator<Integer> iterator = numbers.listIterator();
	    int next = (Integer) iterator.next();

	    for (int i=2; i<numbers.size(); i++){
	        if (i>=1){
	            numbers.remove(i);
	        }
	        if (next%i!=0){
	            numbers.remove(i);
	        }
	    }
	        System.out.println("Removing Prime Numbers and Printing numbers: " + numbers);
	    
	}

}
