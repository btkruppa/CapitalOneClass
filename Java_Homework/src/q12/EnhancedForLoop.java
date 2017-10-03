package q12;


public class EnhancedForLoop {

	public static void main(String[] args) {
		int[] arr = new int[100];
		
		System.out.println("Printing Array Numbers 1 to 100: ");
		for (int i = 0; i <100; i++) {
			arr[i] = i+1;
			System.out.println(i);
		}
	
		System.out.println("Printing Even Numbers: ");
		for (int even : arr) {
			if (even % 2 == 0) {
				System.out.println(even);
			}
			
			
		}
	

	}
	
	
	}

