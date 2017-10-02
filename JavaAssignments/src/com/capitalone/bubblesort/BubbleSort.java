package com.capitalone.bubblesort;

public class BubbleSort {
	private int temp;
	public boolean flag = true;
	private int[] number;

	public int[] getNumber() {
		return number;
	}

	public void setNumber(int[] number) {
		this.number = number;
	}

	public void getSorted(int[] num) {
		
		for(int i=num.length; i>=0; i--) {
			for (int j = 0; j < num.length-1; j++) {
				if (num[j+1] < num[j]) {
					this.temp = num[j];
					num[j] = num[j+1];
					num[j+1] = this.temp;
				}

			}
		}
		printValue(num);

	}
	public void printValue(int[] num) {
		for(int k=0; k<num.length; k++) {
			System.out.println(num[k]);
		}
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

}
