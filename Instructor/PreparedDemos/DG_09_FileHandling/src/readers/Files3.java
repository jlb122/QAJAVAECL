package readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files3 {

	public static void main(String[] args) {
		
		//Demo 9.03 - Reading from a file
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("src/readers/input.txt"));
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
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
