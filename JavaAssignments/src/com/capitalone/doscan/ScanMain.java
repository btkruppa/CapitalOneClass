package com.capitalone.doscan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScanMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> sb = new ArrayList<Integer>();
		System.out.println("Please enter the Principal : ");
		sb.add(Integer.valueOf(scan.nextLine()));
		System.out.println("Please enter the rate :");
		sb.add(Integer.valueOf(scan.nextLine()));
		System.out.println("Please enter the time period :");
		sb.add(Integer.valueOf(scan.nextLine()));
		ScanBean bean = new ScanBean();
		bean.scanLogic(sb);
		scan.close();
		
	}
}
