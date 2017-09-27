package com.capital.one.comparing;

import java.util.Comparator;

public class CandyFlavorComparator implements Comparator<Candy> {

	@Override
	public int compare(Candy o1, Candy o2) {
		if (o1.getFlavor().equals(o2.getFlavor())) {
			return 0;
		} else if ("sweet".equals(o1.getFlavor())) {
			return -11;
		} else if ("sweet".equals(o2.getFlavor())) {
			return 1;
		} else {
			return 0;
		}
	}

}
