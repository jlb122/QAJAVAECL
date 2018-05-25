package com.qa6;

public class ArrayUtils {

	public static int findHighest(int[] array) {
		
		int highestSoFar = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] > highestSoFar) {
				highestSoFar = array[i];
			}
		}
		
		return highestSoFar;
		
	}

}
