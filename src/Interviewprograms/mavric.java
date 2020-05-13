package Interviewprograms;

public class mavric 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s =null;
		
		try {
		int n = s.length();
		System.out.println(n);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of boundary exception");
		}
		
		catch(Exception e)
		{
			System.out.println("Master exception");
		}
		
		System.out.println("No exception");
	}

}
