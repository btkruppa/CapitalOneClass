package Q1bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		int [] array={7,1,12,5,6,3,2,3,7,9,8,4};
	
		
		for (int j = array.length; j >= 0; j--) {
			for (int i = 1; i < array.length; i++) {
				int temp = 0;
				if (array[i - 1] > array[i]) {
					temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
				}
			}

		}

	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
}

}