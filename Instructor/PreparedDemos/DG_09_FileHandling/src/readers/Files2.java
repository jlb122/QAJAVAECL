package readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files2 {

	public static void main(String[] args) throws IOException {
		
		// Demo 9.02 - BufferedReader and FileReader
		BufferedReader in = null;
		String file = "input.txt";
		
		in = new BufferedReader(new FileReader(file));
		// Use reader

		if(in != null) in.close();
	}

}
