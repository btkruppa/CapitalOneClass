package Q1bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		int [] array={7,1,12,5,6,3,2,3,7,9,8,4};
		int temp =0;
		
		for (int i =0;i<array.length;i++){
			for (int j =0;j<array.length-1;j++){
			if (array[i]>array[i+1]){
			//System.out.println(array[j-1]);
			temp=array[i+1];
			array[i]=temp;
			System.out.println(array[i]);
		}

	}

}
}
}