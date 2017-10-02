
public class ArrayClass {

	public static void main(String[] args) {
		
		//declare array and set size
		int[] myArray = new int[100];
		
		//fill array
		for (int i = 0; i < 100; i++) {
			myArray[i] = i +1;
		}
		
		// Use for each to print out even numbers
		for (int whatever : myArray) {
			if(whatever % 2 == 0) {
				System.out.println(whatever);
			}
			
		}
	}
}
