package demo1.lambdas;

import java.util.ArrayList;

public class Lambda1 {

	public static void main(String[] args) {
		
		// Demo 11.1 - Type with declaration
		MathOperation add = (int a, int b) -> a + b;
		System.out.println("10 + 5 = " + operate(10,  5,  add));
		
		MathOperation subtract = (int a, int b) -> a - b;
		System.out.println("10 - 5 = " + operate(10,  5,  subtract));
		
		MathOperation divide = (a, b) -> {return a / b;};
		System.out.println("10 / 5 = " + operate(10,  5,  divide));
		
		MathOperation multiply = (a, b) -> a * b;
		System.out.println("10 * 5 = " + operate(10, 5, multiply));
		
		GreetingService greet1 = message -> System.out.println("Hello " + message);
		greet1.sayMessage("World");
		
		GreetingService greet2 = message -> System.out.println("Well, Hello there, " + message + ", how are you!");
		greet2.sayMessage("World");
		
		// Using Lambda expressions
		ArrayList<Integer> tempList = new ArrayList<>();
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		// Previously, to loop through an array list:
//		for(int i = 0; i < intList.size(); i++) {
//			tempList.add(intList.get(i) + 1);
//		}
		
		// Now using lambdas
		intList.forEach(i -> tempList.add(i + 1));
		
		System.out.println(intList);
		System.out.println(tempList);

	}
	
	interface MathOperation {
		public int operation(int a, int b);
	}
	
	private static int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
	
	interface GreetingService {
		public void sayMessage(String message);
	}

}


