package com.capitalone.evenlogic;

import java.util.ArrayList;
import java.util.List;

public class EvenLogic {
	List<Integer> li = new ArrayList<Integer>();
	List<Integer> newArray = new ArrayList<>();
	public void getEvenNum(int num) {
		for(int i=0; i<num; i++) {
			li.add(i);

			if(li.get(i) != 0 && li.get(i)%2 == 0) {
				newArray.add(i);
			}

		}
		for(Integer newList : newArray) {
			System.out.println(newList);
		}

	}

}
