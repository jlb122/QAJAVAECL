package tryCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D_ThrowingExceptions {
	// Demo 8.04 - Throwing Exceptions
	public static void main(String[] args) {
		
		try {
			readAFile();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readAFile() throws ArrayIndexOutOfBoundsException, IOException  {

		try(
				FileReader fr = new FileReader("src/tryCatch/input.txt");
				BufferedReader br = new BufferedReader(fr);
				) {

			String line = br.readLine();

			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}		
		}

		finally {
			System.out.println("I execute whether there has been an error or not");
		}	
	}
}
