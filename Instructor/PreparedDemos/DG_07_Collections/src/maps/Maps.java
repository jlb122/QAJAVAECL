package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		
		// Demo 7.06 - Maps
		// Allows mapping of unique keys to values
		Map<String, String> m1 = new HashMap<String, String>();
		
		m1.put("Hugh", "8");
		m1.put("Pugh", "31");
		m1.put("Barney McGrew", "12");
		m1.put("Cuthbert", "14");
		
		System.out.println("Map Elements");
		System.out.println("\t" + m1);
		
		// Demo 7.07 - TreeMaps
		// Provides efficient means of storing key/value pairs in sorted order
		// Allows rapid retrieval
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		
		tm.put("Hugh", new Double(3434.34));
		tm.put("Pugh", new Double(123.45));
		tm.put("Barney McGrew", new Double(7654.232));
		tm.put("Cuthbert", new Double(8787.123));
		tm.put("Dibble", new Double(456.654));
		tm.put("Grub", new Double(2562.64));
		
		System.out.println("TreeMap Elements");
		System.out.println("\t" + tm);
		
		// Demo 7.08 - Linked Hash Map
		// Extends HashMap and maintains linked list of entries in order inserted
		LinkedHashMap<String, Double> lhm = new LinkedHashMap<String, Double>();
		lhm.put("Hugh", new Double(3434.34));
		lhm.put("Pugh", new Double(123.45));
		lhm.put("Barney McGrew", new Double(7654.232));
		lhm.put("Cuthbert", new Double(8787.123));
		lhm.put("Dibble", new Double(456.654));
		lhm.put("Grub", new Double(2562.64));
		
		System.out.println("LinkedHashMap Elements");
		System.out.println("\t" + lhm);
	}

}
