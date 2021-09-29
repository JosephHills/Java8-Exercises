package com.qa.exercise3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckString1Test {
	
	CheckString1 cs = new CheckString1();
	@Test
	public void match1Test() {
		assertEquals(true, cs.match1("match"));
		assertEquals(false, cs.match1("unmatch"));
	}
	

}
