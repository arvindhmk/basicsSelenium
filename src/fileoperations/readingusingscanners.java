package fileoperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readingusingscanners 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub

		File file = new File("usingfos.txt");
		
		Scanner read = new Scanner(file);
		
		while(read.hasNext())
		{
			System.out.println(read.nextLine());
		}
	}

}
