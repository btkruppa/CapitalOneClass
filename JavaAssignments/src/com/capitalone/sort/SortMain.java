package com.capitalone.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortMain {
	public static void main(String[] args) {
		ArrayList<SortBeanLogic> li = new ArrayList<SortBeanLogic>();
		SortBeanLogic sb = new SortBeanLogic("Kannan",30,"EEE");
		SortBeanLogic sb1 = new SortBeanLogic("Jagatha",32,"ECE");
		li.add(sb);				
		li.add(sb1);
		//Unordered List
		System.out.println("Unordered : ");
		for(SortBeanLogic liNew : li) {
			System.out.println(liNew);
		}
		//Order by Age
		System.out.println("Ordered by age : " );
		Collections.sort(li, new CompareByAge());
		for(SortBeanLogic liNew : li) {
			System.out.println(liNew);
		}
		//Order by Name
		System.out.println("Ordered by Name : ");
		Collections.sort(li, new CompareByName());
		for(SortBeanLogic liNew : li) {
			System.out.println(liNew);
		}
	}
}
