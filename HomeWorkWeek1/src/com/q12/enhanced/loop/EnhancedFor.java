package com.q12.enhanced.loop;

public class EnhancedFor {
	
	public static void main(String[] args) {
		
		int[] num = new int[100];
		
		for (int i=0; i<100; i++) {
			num[i] = i+1;
		}
		
		System.out.println("Even Numbers are:");
		
		for(int even : num) {
			if(even % 2 == 0) {
				System.out.println(even);
			}
		}
		
	}

}
