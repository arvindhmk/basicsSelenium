package Javaprograms;

public class Splitstring 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str ="abcd1$?23=+4efg";
		
		StringBuffer num = new StringBuffer();
		StringBuffer aphabets=new StringBuffer();
		StringBuffer specialchars=new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num.append(str.charAt(i));
			}
			else if(Character.isAlphabetic(str.charAt(i)))
			{
				aphabets.append(str.charAt(i));
			}
			else
			{
				specialchars.append(str.charAt(i));
			}
		}
		
		System.out.println(num);
		System.out.println(aphabets);
		System.out.println(specialchars);
		
		
	}

}
