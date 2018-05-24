
public class Main {

	public static void main(String[] args) {

		//1
		String name;
		int age;
		
		//2
		name = "Alice";
		age = 21;
		
		//3
		System.out.println(name);
		System.out.println(age);
		
		//4
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		
		//5
		age = 100;
		System.out.println("My new age is " + age);
		
		//6
		int m = 1;
		double x = 0.5;
		int c = 15;
		
		double y = m * x + c;
		
		System.out.println("If y were a double: " + y);
		
		//7
		boolean isRaining = false;
		//8
		boolean happy = true;
		
		//9 - using and
		System.out.println(isRaining && happy);
		System.out.println(isRaining && ! happy);
		System.out.println(! isRaining && happy);
		System.out.println(! isRaining && ! happy);
		
		//using or
		System.out.println(isRaining || happy);
		System.out.println(isRaining || ! happy);
		System.out.println(! isRaining || happy);
		System.out.println(! isRaining || ! happy);
		
	}

}
