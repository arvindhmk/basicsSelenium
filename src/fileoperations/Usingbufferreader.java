package fileoperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Usingbufferreader 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		String location="usingfos.txt";
		
		FileReader reader = new FileReader(location);
		BufferedReader breader = new BufferedReader(reader);
		
		String content;
		while((content=breader.readLine())!= null)
		{
			System.out.println(content);
		}	
	}
}
