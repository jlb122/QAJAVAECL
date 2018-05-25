package demo1.tryCatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D_ThrowingExceptions {

	public static void main(String[] args) {
		
		try {
			readAFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("I'm finally here...");
		}
		
		System.out.println("Program continues...");

	}
	
	public static void readAFile() throws IOException {
		
		FileReader fr = new FileReader("src/demo1/tryCatch/input2.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		 while(line != null) {
			 System.out.println(line);
			 line = br.readLine();
		 }
	}

}
