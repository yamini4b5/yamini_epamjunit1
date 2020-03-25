package com.tddjunit.epamtddjunit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveaTest {

	@Test
	void test1() {
		removea ra = new removea();
		String actual = ra.rem("ABCD");
		assertEquals("BCD",actual);		
	}
	@Test
	void test2() {
		removea ra = new removea();
		String actual = ra.rem("AACD");
		assertEquals("CD",actual);		
	}
	@Test
	void test3() {
		removea ra = new removea();
		String actual = ra.rem("BACD");
		assertEquals("BCD",actual);		
	}
	@Test
	void test4() {
		removea ra = new removea();
		String actual = ra.rem("BBAA");
		assertEquals("BBAA",actual);		
	}
	@Test
	void test5() {
		removea ra = new removea();
		String actual = ra.rem("AABAA");
		assertEquals("BAA",actual);		
	}

}
