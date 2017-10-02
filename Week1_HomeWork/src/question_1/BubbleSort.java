package question_1;

public class BubbleSort {

	int temp = 0;
	int[] myArr = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };

	public BubbleSort() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int[] getMyArr() {
		return myArr;
	}

	public void setMyArr(int[] myArr) {
		this.myArr = myArr;
	}

	public void bubblesortnew() { // logic method bubblesort shoudl be called from main

		for (int i = myArr.length; i >= 0; i--) {
			for (int j = 0; j < myArr.length - 1; j++) {
				if (myArr[j] > myArr[j + 1]) {
					temp = myArr[j];
					myArr[j] = myArr[j + 1];
					myArr[j + 1] = temp;
				}
             
			}
		}
		printvalue(myArr);
	}

	public void printvalue(int[] myArr) {
		for (int k = 0; k < myArr.length; k++) {
			System.out.println(myArr[k]);
		}
	}
}
