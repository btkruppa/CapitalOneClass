package question1;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] intArray = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		System.out.println("Before sorting the elements");
		for(int i=0; i<intArray.length; i++){
		System.out.println(intArray[i]);
	}
	BubbleSort(intArray);
	System.out.println("After sorting the elements");
	for(int i=0; i<intArray.length; i++){
	System.out.println(intArray[i]);
	}
	}

	private static void BubbleSort(int[] array) {
		int temp = 0;
		for(int i=0; i<array.length; i++){
			for(int j=1; j<array.length; j++){
				if(array[j-1]>array[j]){
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		
	}
}
