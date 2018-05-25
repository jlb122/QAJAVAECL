package lambdas;

public class LambdaExample1 {

	public static void main(String[] args) {
		
		LambdaExample1 tester = new LambdaExample1();
		
		// Demo 11.01 - with type declaration
		MathOperation add = (int a, int b) -> a + b;
		System.out.println("10 + 5 = " + tester.operate(10, 5, add));
		
		// Demo 11.02 - without type declaration
		MathOperation subtract = (a, b) -> a - b;
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtract));
		
		// Demo 11.03 - with return statement along with {}
		MathOperation multiply = (int a, int b) -> { return a * b; };
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiply));
		
		// Demo 11.04 - without return and {}
		MathOperation divide = (int a, int b) -> a / b;
		System.out.println("10 / 5 = " + tester.operate(10, 5, divide));
		
		// Demo 11.05 - with ()
		GreetingService greetService1 = (message) -> System.out.println("Hello " + message);
		greetService1.sayMessage("World");
		
		// Demo 11.06 - without ()
		GreetingService greetService2 = message -> System.out.println("Hello " + message);
		greetService2.sayMessage("World, again!");
		
		
	}


	interface MathOperation {
		int operation(int a, int b);
	}
	
	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a,  b);
	}
	
	interface GreetingService {
		void sayMessage(String message);
	}
}
