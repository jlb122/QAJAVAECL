package readers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Files4 {

	public static void main(String[] args) {
		
		// Demo 9.04 - Writing to a file
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("src/readers/output.txt"));
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter a line of text");
			String line = br.readLine();
			while (!line.equals("stop")) {
				bw.write(line + "\n");		// Writes to output.txt
				System.out.println("Enter a new line of text or type stop to quit");
				line = br.readLine();		// Reads from console
			}
			bw.flush(); 					// Required
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (br != null) br.close();
				if (bw != null) bw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	// Demo 9.05 - Throwing exceptions to clean the code...
}
