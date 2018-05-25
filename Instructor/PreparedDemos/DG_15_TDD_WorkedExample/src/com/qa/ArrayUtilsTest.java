package com.qa;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class ArrayUtilsTest {
	
	int[] array = {10};
	
	@Test
	public void findHighestArrayOfOne() {
		
		assertThat(ArrayUtils.findHighest(array), is(10));
	}

}
