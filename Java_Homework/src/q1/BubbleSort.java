package q1;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };
		
		System.out.print("Array before sorting: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

		}
		System.out.println();
		System.out.print("Array after sorting: ");
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
