package com.qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsoleReader {

	public void readInputPrint()
	{
		BufferedReader br = null;
		StringBuffer sb = new StringBuffer();
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter a line of text");
			
			String line = br.readLine();
			
			while(true)
			{
				if(line.equals("stop"))
					break;
				sb.append(line+"\n");
				System.out.println("Enter a line of text");
				line = br.readLine();
			}
			
			System.out.println(sb.toString());

		}
		catch(IOException ex)
		{
			try
			{
				br.close();
			}
			catch(IOException excep)
			{
				System.out.println(excep);
			}
			
		}
		
			
	}
	
     public static void main(String[] args) {
		
		MyConsoleReader mc = new MyConsoleReader();
		mc.readInputPrint();

	}
	
	

}
