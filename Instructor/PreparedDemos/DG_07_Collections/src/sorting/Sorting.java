package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		
		// Demo 7.16 - Sorting Manually
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(4);
		intList.add(193);
		intList.add(23);
		intList.add(234);
		
		Collections.sort(intList);
		
		for(int x = 0; x < intList.size(); x++) {
			System.out.println(intList.get(x) + ", ");
		}

	}

}
