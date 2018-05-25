package demo5.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingMain {

	public static void main(String[] args) {
		// Demo 7.15 - Sorting Manually
		
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(4);
		intList.add(193);
		intList.add(23);
		intList.add(234);
		
		System.out.println(intList);
		
		Collections.sort(intList);
		
		for(int x = 0, y = intList.size(); x < y; x++) {
			System.out.println(intList.get(x) + ", ");
		}
		
		System.out.println(intList);
	}

}
