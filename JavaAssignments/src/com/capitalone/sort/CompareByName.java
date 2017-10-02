package com.capitalone.sort;

import java.util.Comparator;

public class CompareByName implements Comparator<SortBeanLogic>{

	@Override
	public int compare(SortBeanLogic o1, SortBeanLogic o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
