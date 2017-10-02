package question_2;

public class Fibonacci {

	private int temp;

	public int Fibnew(int temp) {
		this.temp = temp; // temp value is assigned in main class
		int[] myArr = new int[temp];
		System.out.println(myArr.length);
		myArr[0] = 0;
		myArr[1] = 1;

		for (int i = 2; i < temp; i++) {
			myArr[i] = myArr[i - 1] + myArr[i - 2];
		}

		System.out.println("Fibonacci myArr upto " + temp);

		for (int i = 0; i < temp; i++) {
			System.out.print(myArr[i] + " ");
		}
		return temp;
	}

}
