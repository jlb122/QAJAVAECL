package qa;

public class F_Arrays {

	public static void main(String[] args) {
		// Demo 2.12 - Declaring Arrays
		int[] arr = new int[7]; // Declares a 7 element array of type int
		int[] arr2 = {10, 20, 30, 40, 50, 60, 70};  // Declares a 7 element array of type int with values assigned
		String[] arr3 = {"Rod", "Jane", "Freddie"}; // Declares a 3 element array of type String with values assigned

		// Demo 2.13 - Accessing array elements
		int a = arr2[3];
		System.out.println(a);
		System.out.println(arr2[5]);
		System.out.println(arr3[2]);

		// Demo 2.14 - Changing values of elements
		arr2[3] = 45;
		System.out.println(arr2[3]);
		System.out.println(a);

		// Demo 2.15 - Most common array error...
		// ArrayIndexOutOfBoundsException
		// System.out.println(arr3[3]);

	}

}
