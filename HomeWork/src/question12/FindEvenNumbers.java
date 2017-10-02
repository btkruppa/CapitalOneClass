package question12;

public class FindEvenNumbers {

	public static void main(String[] args) {

		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			// System.out.println(arr[i]);
		}

		for (int j : arr) {
			if (j < arr.length) {
				if (arr[j] % 2 == 0) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
