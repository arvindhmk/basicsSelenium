package Javaprograms;

public class Throwinexception 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a=3;
		int b=2;
		
		try {
			int c= a/b;
			System.out.println(c);
		}
		
		catch(Exception e) 
		{
		
			System.out.println(e.getMessage());
		}
	}

}
