package fileoperations;

import java.io.FileWriter;
import java.io.IOException;

public class Usingfilewriter 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		//File location // file content

		String location = "filewriterexample.txt";
		String content = "filewrite using filewriter";
		
		FileWriter fwrite=null;
		try 
		{
			fwrite = new FileWriter(location);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try 
		{
			fwrite.write(content);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally 
		{
		
			fwrite.close();
		}	
	}
}
