package question9;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {

		ArrayList<Integer> primeNums = new ArrayList<Integer>();
		for (int x = 2; x <= 100; x++) {
			for (int y = 2; y <= x; y++) {

				if (y == x) {
					primeNums.add(x);
				}
				if (x % y == 0) {
					break;
				}
			}
		}
		System.out.println("Below are the Prime Numbers from 1 to 100");
		for (int num : primeNums) {
			System.out.print(num + " ");
		}
	}

}
