package array.utils.by.ed;

public class ArrayUtils {
	
	public static int findHighest(int[] array) throws RuntimeException {
		
		int highestSoFar = Integer.MIN_VALUE;
		
		for(int i = 0, j = array.length; i < j; i++) {
			if(array[i] > highestSoFar) highestSoFar = array[i];
		}
		
		return highestSoFar;
	}

}
