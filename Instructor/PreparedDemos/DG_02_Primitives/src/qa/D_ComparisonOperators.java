package qa;

public class D_ComparisonOperators {

	public static void main(String[] args) {
		// Demo 2.06 - Comparisons
		
		int x = 10, y = 100;
		
		System.out.println(x > y); 		// Greater than
		System.out.println(x < y); 		// Less than
		System.out.println(x >= y);		// Greater than or equal to
		System.out.println(x <= y);		// Less than or equal to
		System.out.println(x != y);		// Not equal to
		System.out.println(x == y);		// Equal to
		System.out.println(x = y);
		
		// Demo 2.07 - BODMAS
		int a = 1 + 5 * 2;
		int b = (1 + 5) * 2;
		System.out.println(a);
		System.out.println(b);

	}

}
