package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {		

		// Collection that cannot contain duplicate elements

		// Demo 7.09 - Sets
		int count[] = {34, 22, 10, 60, 30, 22};
		
		Set<Integer> set = new HashSet<Integer>();
		
		try {
			for(int i = 0; i < 5; i++) {
				set.add(count[i]);
			}
			
			System.out.println(set);
			
			// Demo 7.10 - TreeSets
			TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is:");
			System.out.println(sortedSet);
			
			// Demo 7.11 - First and last...
			System.out.println("The 1st element of the set is: " + (Integer)sortedSet.first());
			System.out.println("The last element of the set is: " +(Integer)sortedSet.last());
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
		// Demo 7.12 - LinkedHashSets
		// Maintains linked list of entries in order added to set
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println(hs);

	}

}
