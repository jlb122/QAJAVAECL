package tryCatch;

public class A_TryCatch1 {

	public static void main(String[] args) {
		
		// Demo 8.01 - Try Catch Finally
		
		int[] array = new int[10];
		
		try {
			array[11] = 42;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("The program will continue..");
		}
		finally {
			System.out.println("Continue to here");
		}
		
		System.out.println("I'm continuing");
	}

}
