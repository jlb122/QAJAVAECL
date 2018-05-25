package demo3.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsMain {

	public static void main(String[] args) {
		// Sets are collections that contain no duplicates
		
		// Demo 7.9 - Sets
		int count[] = {34, 22, 10, 60, 30, 22};
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i < count.length; i++) {
			set.add(count[i]);
		}
		
		System.out.println(set);
		
		// Demo 7.10 - TreeSets
		TreeSet<Integer> treeSet = new TreeSet<>(set);
		
		System.out.println("The sorted set is: " + treeSet);
		
		// Demo 7.11 - Accessing elements in a TreeSet 
		System.out.println("1st element in treeSet is: " + (Integer)treeSet.first());
		System.out.println("Last element in treeSet is: " + (Integer)treeSet.last());
		
		// Demo 7.12 - LinkedHashSets
		// Maintains a linked list of entries in order of insertion
		HashSet<String> hs = new LinkedHashSet<>();
		hs.add("L");
		hs.add("I");
		hs.add("V");
		hs.add("E");
		hs.add("R");
		hs.add("P");
		hs.add("O");
		hs.add("O");
		hs.add("L");
		
		System.out.println(hs);
		
	}

}
