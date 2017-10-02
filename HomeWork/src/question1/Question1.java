package question1;

public class Question1 {

	public static void BubbleSort(int array[]){
		int x = array.length;
		int temp = array[0]; 
		for(int i = 0; i< x; i++){
			for(int j=1; j<x; j++){
				if(array[j-1] > array[j]){
					temp= array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] input = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		System.out.println("Before sorting");
		for (int k=0;k<input.length;k++){
			System.out.println(input[k] + " ");	
		}
		BubbleSort(input);
		System.out.println("After sorting");
		for (int k=0;k<input.length;k++){
			System.out.println(input[k] + " ");	
		}

	}

}

//-----------------------


