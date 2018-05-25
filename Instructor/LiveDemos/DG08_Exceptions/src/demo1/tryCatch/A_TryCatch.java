package demo1.tryCatch;

public class A_TryCatch {

	public static void main(String[] args) {
		// Demo 8.1
		
		int[] array = new int[10];
		
		try {
			array[10] = 42;
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("The program will continue...");
		}
		finally {
			System.out.println("I always execute as I am finally");
		}
		
		System.out.println("I'm continuing...");
		

	}

}
