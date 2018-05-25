package demo1.tryCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C_EnhancedTryCatch {

	public static void main(String[] args) {
		// Demo 8.3
		
		try (
				FileReader fr = new FileReader("src/demo1/tryCatch/input.txt");
				BufferedReader br = new BufferedReader(fr);
			) {
			
			String line = br.readLine();
			 while(line != null) {
				 System.out.println(line);
				 line = br.readLine();
			 }
		}
		catch(IOException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Exception caught and handled");
		}
		finally {
			System.out.println("I execute whether there was an IOException or not");
			
		}
		
		System.out.println("Program continues");
	}

}
