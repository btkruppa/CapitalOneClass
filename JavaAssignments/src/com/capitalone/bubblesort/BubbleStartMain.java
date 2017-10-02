package com.capitalone.bubblesort;

public class BubbleStartMain extends BubbleSort{
	public static int[] num = {4,5,3,9,0,9,2,10};
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.getSorted(num);
	}
}
