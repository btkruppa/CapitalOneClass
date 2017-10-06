package com.capital.one.comparing;

import java.util.Comparator;

public class CandyNameComparator implements Comparator<Candy> {

	@Override
	public int compare(Candy o1, Candy o2) {
		return o1.getName().charAt(0) - o2.getName().charAt(0);
	}

}
