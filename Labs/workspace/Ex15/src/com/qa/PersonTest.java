package com.qa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	
	private Person fred; 
	private Person bill; 
	private Person jane;
	
    @Before
	public void setUp() throws Exception {
		fred = new Person("Fred", "Foggs", 29);
		bill = new Person("Bill", "Boggs", 29);
		jane = new Person("Jane", "Joggs", 29);
	}
    @Test
	public void testCompareTo() {
    	assertEquals("fred equiv. to jane ", 0, fred.compareTo(jane));
		assertTrue("fred is 'before' bill", fred.compareTo(bill) < 0);
		assertTrue("bill is ‘after' jane", bill.compareTo(jane) > 0);
	}

}
