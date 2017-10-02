package com.capitalone.sort;

import java.util.Comparator;

public class CompareByAge implements Comparator<SortBeanLogic>{

	@Override
	public int compare(SortBeanLogic sb, SortBeanLogic sb1) {
		// TODO Auto-generated method stub
		 return sb.getAge()-sb1.getAge();
	}
	 
}
