package readers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Files1 {

	public static void main(String[] args) throws IOException {
		
		//Demo 9.01 - BufferedReader, InputStreamReader and FileInputStream
		
		// FileInputStream handles raw binary data - byte stream class
		// BufferedReader and InputStreamReader belong to character stream category
		// InputStreamReader builds bridge between FileInputStream and BufferedReader
		
		BufferedReader br = null;
		FileInputStream is = null;
		is = new FileInputStream("src/readers/input.txt");
		// Eclipse offers help...
		br = new BufferedReader(new InputStreamReader(is));
		// Use BufferedReader...
		
		if (br!=null) br.close();
		
		if (is!=null) is.close();
	}

}
