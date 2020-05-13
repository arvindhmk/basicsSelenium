package Javaprograms;

public class palinvirtusa 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str1="madam1";
		
		String palin="";
		char[] arr1=str1.toCharArray();
		
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			 palin = palin + arr1[i];
		}
		
		if(palin.equals(str1))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}

}
