package fileoperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Usingpath 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		String location = "path.txt";
		
		String content = "using path in java";
		
		Path path = Paths.get(location);
		
		Files.write(path, content.getBytes());
		
	}

}
