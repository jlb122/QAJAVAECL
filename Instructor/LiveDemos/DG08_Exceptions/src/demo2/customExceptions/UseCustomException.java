package demo2.customExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseCustomException {

	public static void main(String[] args) {

		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a new line of text:");
			String line = br.readLine();
			while(line != null) {
				if(line.equals("no")) {
					throw new BadLineException("Line said 'no'", line);
				}
				System.out.println(line);
				System.out.println("Enter a new line of text:");
				line = br.readLine();
			}
		}
		catch (IOException | BadLineException e) {
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
			System.out.println("Finally here...");
		}
		
		System.out.println("Progran continues...");

	}

}
