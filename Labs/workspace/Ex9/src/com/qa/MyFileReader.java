package com.qa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//1
public class MyFileReader {

	public static void main(String[] args) {
		MyFileReader myFileReader = new MyFileReader();

		// part 1:
		 myFileReader.readAndPrint();

		// part 2:
         myFileReader.writeMyFile();

		// part 3:
		//15
		try {
			myFileReader.readMyFile();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found?");
		} catch (BadLineException e) {
			System.out.println(e.getMessage() + " :: " + e.getBadLine());
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}

	// 2
	public MyFileReader() {

	}

	// 3
	public void readAndPrint() {
		BufferedReader br = null;

		try {
			// a, b
			br = new BufferedReader(new FileReader(new File(
					"./src/com/qa/Input.txt")));

			// c
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			// d
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Generic Reading Error");
			e.printStackTrace();
			// e
		} finally {
			System.out.println("Doing the finally clause before returning");
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("IO Exception in the finally clause");
					e.printStackTrace();
				}
		}
	}

	// 5
	public void writeMyFile() {

		BufferedWriter bw = null;

		try {
			// 6
			System.out.println("Trying to write");
			bw = new BufferedWriter(new FileWriter("Output.txt"));

			// 7
			for (int x = 0; x < 100; x++) {
				bw.append("This is line: " + x + "\r\n");
			}
			// 8
		} catch (IOException e) {
			System.out.println("Caught an IO exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 9
		} finally {
			System.out.println("Finally clause, closing the file");
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					System.out
							.println("Caught IO exception in the finally block");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	//12						//13
	public void readMyFile() throws BadLineException, FileNotFoundException,
			IOException {
		BufferedReader br = null;

		try {
			//12a
			br = new BufferedReader(new FileReader("Output.txt"));
				
			String line = br.readLine();

			while (line != null) {
				//12b
				if (line.startsWith("This is line:")) {
					System.out.println("Valid Line: " + line);
				} else {
					// 12c
					throw new BadLineException("Error when processing a line", line);
				}
				
				line = br.readLine();
			}
			//14
		} finally {
			if (br != null)
				br.close();
		}
	}
}
