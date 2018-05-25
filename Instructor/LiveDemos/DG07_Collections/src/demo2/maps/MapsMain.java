package demo2.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsMain {

	public static void main(String[] args) {
		
		// Demo 7.6 - Maps
		// Allow mapping of unique keys to values
		
		Map<String, String> map1 = new HashMap<>();
		
		// Put items into map1
		map1.put("Cuthbert", "14");
		map1.put("Hugh", "8");
		map1.put("Barney McGrew", "12");
		map1.put("Pugh", "31");
		
		System.out.println("Map Elements");
		System.out.println("\t" + map1);
		System.out.println("\tOrdered by key hash");
		
		// Demo 7.7 - TreeMaps
		// Provides efficient means of storing key/value pairs in sorted order
		// Allows rapid retrieval
		TreeMap<String, Double> treeMap = new TreeMap<>();
		
		treeMap.put("Pugh", new Double(4321.12));
		treeMap.put("Pugh", new Double(123.45));
		treeMap.put("Barney McGrew", new Double(7654.21));
		treeMap.put("Cuthbert", new Double(456.123));
		
		System.out.println("TreeMap Elements");
		System.out.println("\t" + treeMap);
		System.out.println("\tSorted by key");
		
		// Demo 7.8 - Linked Hash Map
		// Extends HashMap but it maintains linked list of entries in the order inserted
		Map<String, String> map2 = new LinkedHashMap<>();
		
		// Put items into map1
		map2.put("Cuthbert", "14");
		map2.put("Hugh", "8");
		map2.put("Barney McGrew", "12");
		map2.put("Pugh", "31");
				
		System.out.println("LinkedHashMap Elements");
		System.out.println("\t" + map2);
		System.out.println("\tInsertion order preserved");
		
	}

}
