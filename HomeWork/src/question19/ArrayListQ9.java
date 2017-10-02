package question19;

import java.util.ArrayList;

public class ArrayListQ9 {

	public static void main(String[] args) {

		ArrayList<Integer> elements = new ArrayList<Integer>();
		Integer intObject;

		for (int i = 0; i < 10; i++) {
			intObject = new Integer(i + 1);
			elements.add(intObject);
		}
		System.out.println("List of Array Numbers" + elements); // This will print total number of integers


		// Getting even numbers
		ArrayList<Integer> evens = getEvenNum(elements);
		Integer sumOfEvenNum = new Integer(0);
		for (Integer x : evens) {
			sumOfEvenNum += x;
		}
		System.out.println("Sum of Even Numbers: " + sumOfEvenNum);

		// Getting Odd Numbers
		ArrayList<Integer> odds = getOddNum(elements);
		Integer sumOfOddNum = new Integer(0);
		for (Integer x : odds) {
			sumOfOddNum += x;
		}
		System.out.println("Sum of Odd Numbers: " + sumOfOddNum);

		// Getting Non Prime Numbers
		ArrayList<Integer> nonPrimeNum = getNonPrimeNum(elements);
		System.out.println("List of Non-Prime Numbers: " + nonPrimeNum);
	}

	private static ArrayList<Integer> getEvenNum(ArrayList<Integer> num) {
		Integer n1;
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

		// for (Integer x : num) {
		for (int k = 0; k < num.size(); k++) {
			n1 = num.get(k);
			if (n1 % 2 == 0) {
				evenNumbers.add(n1);
			}
		}
		return evenNumbers;
	}

	private static ArrayList<Integer> getOddNum(ArrayList<Integer> num) {
		Integer n1;
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		// for (Integer x : num) {
		for (int k = 0; k < num.size(); k++) {
			n1 = num.get(k);
			if (n1 % 2 != 0) {
				oddNumbers.add(n1);
			}
		}
		return oddNumbers;
	}

	private static ArrayList<Integer> getNonPrimeNum(ArrayList<Integer> num) {
		Integer n1;
		ArrayList<Integer> nonPrimeNumbers = new ArrayList<Integer>();
		Integer temp;

		for (int x = 0; x < num.size(); x++) {
			n1 = num.get(x);			
			if (n1 == 1)
				nonPrimeNumbers.add(n1);			
			boolean nPrime = true;
			// System.out.println(n1);
			if (n1 != 1) {
				for (int y = 2; y <= n1 / 2; y++) {
					temp = n1 % y;
					if (temp == 0) {
						nPrime = false;
						break;
					}
				}
				if (!nPrime) {
					nonPrimeNumbers.add(n1);

				}
			} 
		}
		return nonPrimeNumbers;
	}
}
