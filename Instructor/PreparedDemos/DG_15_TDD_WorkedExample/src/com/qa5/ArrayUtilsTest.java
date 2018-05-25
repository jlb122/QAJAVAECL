package com.qa5;

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

}
