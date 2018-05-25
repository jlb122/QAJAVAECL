package demo7.generics;

public class GenericMethods {

	// Create a generic method
	
	public static <E> void printArray(E[] inputArray) {
		
		// Display array elements of any type of array
		for(E element: inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	
	// Use the generic method
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
	}
}
