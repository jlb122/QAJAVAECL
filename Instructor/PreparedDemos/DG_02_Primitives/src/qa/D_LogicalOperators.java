package qa;

public class D_LogicalOperators {

	public static void main(String[] args) {
		// Demo 2.08 - Logical Operators
		int age = 20, val = 7;

		System.out.println((age >= 18) && (val == 7));
		System.out.println((age >= 18) || (val == 7));
		System.out.println((age <=18) || (val == 7));
		System.out.println((age <= 18) && (val == 7));
		System.out.println((age >=18) && !(val == 8));

	}

}
