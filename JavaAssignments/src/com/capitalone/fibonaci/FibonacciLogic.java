package com.capitalone.fibonaci;

public class FibonacciLogic {
	private int i = 0;
	private int j = 1;
	private int k = 0;
	public void getFibo() {
		System.out.println("\t" + i);
		System.out.println("\t" + j);
		for(int counter=0; counter<25; counter++) {
			k = i + j;
			i = j;
			j = k;
			System.out.println("\t" + k);
		}
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
}
