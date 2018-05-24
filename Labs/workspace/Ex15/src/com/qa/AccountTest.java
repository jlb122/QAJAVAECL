package com.qa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	private Account act;
	
	@Before
	public void setUp() throws Exception {
		// Create an Account
		act = new Account(new String[]{"Link","Visa"},"10-10-22","11223344","1234");
	}

	@Test
	public void testCompareTo() {
		Account inputObject = new Account(new String[]{"Link"},"10-10-22","11223344","1234");
		assertEquals("Login Success",0, act.compareTo(inputObject));
	}
	

}
