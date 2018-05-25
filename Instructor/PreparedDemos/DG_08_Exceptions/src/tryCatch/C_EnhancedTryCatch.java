package tryCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C_EnhancedTryCatch {

	public static void main(String[] args) {

		// Demo 8.03 - Enhanced Try/Catch

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
		catch (IOException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			// Closing of fr and br not needed as done automatically
			System.out.println("I execute whether there has been an error or not");
		}
	}

}
