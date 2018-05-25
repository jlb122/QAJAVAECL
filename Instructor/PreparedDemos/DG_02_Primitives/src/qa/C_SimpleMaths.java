package qa;

public class C_SimpleMaths {

	public static void main(String[] args) {
 
		// Demo 2.03 - Simple operators
		int a = 1 + 5; // Addition
		int b = 1 - 5; // Subtraction
		int c = 1 * 5; // Multiplication
		int d = 1 / 5; // Division
		int e = 1 % 5; // Modulo
		
		// Demo 2.04 - Compound operators
		a += 5; // equivalent to a = a + 5;
		b -= 5; // equivalent to b = b - 5;
		c *= 5; // equivalent to c = c * 5;
		d /= 5; // equivalent to d = d / 5;
		
		// Demo 2.05 - Pre and post increment/decrement
		a++; // returns a and adds 1 to it
		b--; // returns b and subtracts 1 from it
		
		int var1 = 3, var2 = 0;
		var2 = ++var1;	// Adds 1 to var1 and then sets var2 = var1
		System.out.println("Var1: " + var1 + " Var2: " + var2);
		var2 = var1++; 	// Sets var2 to var1 and then adds 1 to var1
		System.out.println("Var1: " + var1 + " Var2: " + var2);
		
	}

}
