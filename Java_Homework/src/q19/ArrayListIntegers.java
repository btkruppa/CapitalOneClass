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
		
		for (int k = numbers.size() - 1; k >= 0; k--) {

			int counter = 0;

			for (int l = 2; l < k; l++) {

				if (numbers.get(k) % l == 0) {

					counter = counter + 1;
				}

			}

			if (counter == 0)
				numbers.remove(k);
	    }
	        System.out.println("Removing Prime Numbers and Printing numbers: " + numbers);
	    
	}

}
