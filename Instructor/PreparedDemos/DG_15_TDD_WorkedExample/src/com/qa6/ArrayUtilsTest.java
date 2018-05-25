package com.qa6;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class ArrayUtilsTest {
	
	int[] array = {10};
	int[] array2 = {10, 20};
	int[] array3 = {1, 4, 7, 100, 22, 34};
	
	@Test
	public void findHighestArrayOfOne() {
		
		assertThat(ArrayUtils.findHighest(array), is(10));
	}
	
	@Test
	public void findHighestInArrayOfTwo() {
		
		assertThat(ArrayUtils.findHighest(array2), is(20));
	}
	
	@Test
	public void findHighestInArbitaryArray() {
		
		assertThat(ArrayUtils.findHighest(array3), is(100));
	
	}
	
	@Test(expected=RuntimeException.class)
	public void findHighestInEmptyArrayThrows() {
		
		int[] array = {};
		ArrayUtils.findHighest(array);
	}
	
	@Test
	public void findHighestInEmptyArrayThrowsWithMsg() {
		
		int[] array = {};
		try {
			ArrayUtils.findHighest(array);
			fail("An Exception should have been thrown");
		}
		catch(RuntimeException e) {
			assertThat(e.getMessage(), is("Empty array"));
		}
	}

}
