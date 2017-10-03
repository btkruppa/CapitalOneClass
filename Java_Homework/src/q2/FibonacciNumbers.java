package q2;


public class FibonacciNumbers {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		System.out.print(i + "," + j); // printing 0 and 1 (first 2 numbers)
		for(int k=2; k < 9; k++) { // looping from 3rd number
			int l;
			System.out.print(",");
			System.out.print(l = i+j);
			i = j;
			j = l;
		}
			
		}

	}


