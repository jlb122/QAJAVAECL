package generics;

public class GenericMethods {
	
	// Demo 7.21 - Create a Generic Method
	// Add method type in triangular brackets after scope declaration

	public static <E> void printArray(E[] inputArray) {
		
		// Display array elements of any array type
		for(E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	// Demo 7.22 - Use the Generic Method
	public static void main(String[] args) {
		
		// Create arrays of Integer, Double and Character
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.println("Array intArray contains:");
		printArray(intArray);
		
		System.out.println("Array doubleArray contains:");
		printArray(doubleArray);
		
		System.out.println("Array charArray contains:");
		printArray(charArray);

	}

}
