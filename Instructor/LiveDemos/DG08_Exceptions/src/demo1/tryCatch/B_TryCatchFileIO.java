package demo1.tryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_TryCatchFileIO {

	public static void main(String[] args) {

		BufferedReader br = null;
		
		try {
		
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a new line of text");
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				System.out.println("Enter another line of text");
				line = br.readLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
