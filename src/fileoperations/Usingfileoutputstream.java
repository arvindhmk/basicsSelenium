package fileoperations;


import java.io.FileOutputStream;
import java.io.IOException;

public class Usingfileoutputstream {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		String location="usingfos.txt";
		String content = "Using Fileoutputstream";
		
		
		FileOutputStream fos = new FileOutputStream(location);
		
		byte[] cont = content.getBytes();
		
		fos.write(cont);
		System.out.println("write content done successfully");
		
		fos.close();
	}
}
