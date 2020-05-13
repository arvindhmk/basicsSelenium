package Javaprograms;

public class Palindromestring 
{

	static boolean isPalin(String str)
	{
		int i=0;
		int j=str.length()-1;
		
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}	
		return true;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str="ozozo";
		
		if(isPalin(str))
		{
			System.out.println("String is palindrome");
		}
		else
			System.out.println("String is not palindrome");
	}
}
