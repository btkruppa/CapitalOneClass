package com.capitalone.ternaryops;

public class TernaryOperations {
	private int miniNum = 0;
	public int getMiniNum() {
		return miniNum;
	}
	public void setMiniNum(int miniNum) {
		this.miniNum = miniNum;
	}
	public void getTernary(int num1, int num2) {
		miniNum = (num1<num2) ? num1 : num2;
		System.out.println("Minimum of "+num1+ " & " +num2+" is "+miniNum);
	}
	
}
