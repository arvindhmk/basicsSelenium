package Javaprograms;

public class printnumofwordsinstring 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s1="I LOVE MY INDIA";
		int count=0;
		String[] s = s1.split("\\s");
		
		for(int i=0;i<s.length;i++)
		{
			count++;
		}
		
		System.out.println(count);
	}

}
