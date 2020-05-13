package Javaprograms;

public class Replacestringvalue 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str="aadithyaalagesan";
		String str2="";
		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
				str2 = str.replace('a', '*');
			}
		}
		System.out.println(str2);		
	}

}
