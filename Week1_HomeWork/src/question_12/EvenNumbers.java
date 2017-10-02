package question_12;

public class EvenNumbers {

	public static void main(String[] args) {

		int myArr[] = new int[100];

		for (int i = 0; i < 100; i++) {

			myArr[i] = i + 1;
		}

		for (int element : myArr) {

			if (element % 2 == 0) {
				System.out.println(element);
			}
		}
	}
}
