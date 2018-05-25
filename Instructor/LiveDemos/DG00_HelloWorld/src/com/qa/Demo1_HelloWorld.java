package com.qa;

public class Demo1_HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Multi Line comment
		 */
		
		//System.out.println("Hello, World!");
		
		// Number Types - Primitives
		int x = Integer.MAX_VALUE;
		double d = Double.MAX_VALUE;
		byte b = Byte.MAX_VALUE;
		short s = Short.MAX_VALUE;
		float f = Float.MAX_VALUE;
		long l = Long.MAX_VALUE;
		
		// Other Primitives...
		char a = 'a';
		char c = '\u0012';
		//System.out.println(c);
		
		boolean over40, male = false; // OK but not good practice as we can't easily see all declarations
							  		  // Good practice to initialise on declaration
		over40 = true;
		male = true;
//		System.out.println(over40);
//		System.out.println(male);
		
		// Behaviours
//		System.out.println(x);
//		x += 1;					// same as x = x + 1;
//		System.out.println(x);
		
		// Incrementers and Decrementers
		int number = 0;
		
//		System.out.println(number);		// 0
//		System.out.println(number++);	// 0
//		System.out.println(number);		// 1
//		System.out.println(++number);	// 2
//		System.out.println(number);		// 2
		
		// Special Case...
//		String myString = "Hello, World!";
//		System.out.println(myString);
//		System.out.println(myString.length());
//		String statement = "The is the answer to the ultimate question";
//		System.out.println(statement.length());
//		
//		System.out.println(myString == "Hello, World!"); // Works but not good!
//		System.out.println(myString.equals("Hello, World!")); // Better
//		
//		System.out.println(myString.toString());
//		System.out.println(myString.toString());
		
		// Arrays - generally of primitives or of objects
		int[] array1 = new int[7];		// Declares an 'empty' 7 element array of type int
		int[] array2 = {10, 20, 30, 40, 50, 60, 70};  //Declare and initialise elements
		String[] array3 = {"Rod", "Jane", "Freddie"}; //Declare and initialise elements
		// SIZES of array1-3 are now fixed
		
		int numFromArray = array1[3];
		int numFromArray2 = array2[5];
		
		System.out.println(numFromArray);		// null? -> 0
		System.out.println(numFromArray2);		// 60
		
		//System.out.println(array3[4]); // ArrayIndexOutOfBoundsException
		
		//array2[8] = 10;
		array2[1] = (int) 10.56;
		System.out.println(array2[1]);
		double newDouble = (double)array2[1];
		System.out.println(newDouble);
		
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
