package tryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_TryCatchFileIO {

	public static void main(String[] args) {
		
		// Demo 8.02 - Try Catch with FileIO
		// To put null input on Mac/Linux, use CTRL+D
		// On Windows, use CTRL+Z+Enter
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a new line of text");
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				System.out.println("Enter a new line of text");
				line = br.readLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(br != null) br.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
