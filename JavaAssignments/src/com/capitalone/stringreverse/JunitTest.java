package com.capitalone.stringreverse;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {

@Test

	public void StringRevTest() {
	StringReverse sr = new StringReverse();
		assertEquals("ahtagaJ", sr.reverseString("Jagatha"));
	}
}
