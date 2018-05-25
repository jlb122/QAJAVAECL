package qa;

public class A_Primitives {

	public static void main(String[] args) {
		// Demo 2.00 - Using comments
		// Adding a single line comment
		
		/* Adding a comment
		 * that can span over lines
		 */
		
		// Demo 2.01 Java Primitive Types
		// Declaring Syntax
		int age = 5;			// Type and name with assignment
		double oldVAT = 17.5;	// Type and name with assignment
		
		char a;					// Type and name - no assignment
		
		boolean over40, male;	// Chained with no assignment
		
		// Number types
		displaySizeMinAndMax(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		displaySizeMinAndMax(Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		displaySizeMinAndMax(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		displaySizeMinAndMax(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
		displaySizeMinAndMax(Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
		displaySizeMinAndMax(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
		
		// Other types
		displaySizeMinAndMax(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		
		// Boolean
		displaySizeMinAndMax(true, false);
	}
	
	public static void displaySizeMinAndMax(Class<?> type, int size, Number min, Number max) {
		System.out.printf("type:%-6s size:%-2s min:%-20s max:%s\n", type, size, min, max);
	}
	
	public static void displaySizeMinAndMax(boolean val1, boolean val2) {
		System.out.println("type:booleans are either " + val1 + " or " + val2);
	}
}
