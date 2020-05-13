package fileoperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Usingbufferedwriter 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		String location= "bufferedwriter.txt";
		String content="using buffered writer";
		
		FileWriter fwrite= new FileWriter(location);
		
		BufferedWriter bwriter = new BufferedWriter(fwrite);
		
		bwriter.write(content);
		System.out.println("write content done successfully");
		
		bwriter.close();
		
		
	}

}
