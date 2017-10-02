package com.capitalone.triangle;

import java.util.ArrayList;

public class TriangleLogic {
	private int cnt=0;
	private int out;
	ArrayList <Integer> line = new ArrayList<>();
	boolean flag = true;
	public void getTriangle(int num) {
		for(int i=1;i<=num;i++) {
			System.out.println("\n");
			line.clear();
			for(int j=1;j<=i;j++) {
				cnt++;
				if ((cnt%2)==0) {
					out=1;
				}
				else out=0;
				line.add(out);
			}
			System.out.println(line);
		}
	}
}
