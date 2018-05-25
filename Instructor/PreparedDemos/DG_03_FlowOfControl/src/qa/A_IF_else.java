package qa;

public class A_IF_else {

	public static void main (String[] args) {
		
		// Demo 3.01 - Single If
		// if(condition) { Do Something }
		int i = 14;
		
		if (i % 2 == 0) {
			System.out.println(i + " is even");
		}
		
		if (i % 2 == 0 && i > 10) {
			System.out.println(i + " is even");
			System.out.println(i + " is greater than 10");
		}
		
		// Change value of i and run again
		
		// Demo 3.02 - If else
		if (i % 2 == 0) {
			System.out.println(i + " is even");
		}
		else
		{
			System.out.println(i + " is odd");
		}
		
		// Demo 3.03 - If Else If Else
		if (i == 1) {
			System.out.println("i is 1");
		}
		else if (i == 2) {
			System.out.println("i is 2");
		}
		else
		{
			System.out.println("i is not 1 or 2");
			
		}
		
		// Demo 3.04 - Ternary Operator
		// (condition) ? expression1 : expression2
		String str = (i % 2 == 0) ? "i is even" : "i is odd";
		System.out.println(str);
	
	}
}
