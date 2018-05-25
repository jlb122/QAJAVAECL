package enumarators;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {

	public static void main(String[] args) {
		
		// Demo 7.13
		// Legacy - superceded by Iterators but not deprecated
		Enumeration<String> days;
		Vector<String> dayNames = new Vector<String>();
		
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		
		days = dayNames.elements();
		
		while(days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
	}

}
