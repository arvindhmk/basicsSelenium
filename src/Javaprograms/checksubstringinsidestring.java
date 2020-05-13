package Javaprograms;

public class checksubstringinsidestring 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str="test";
		
		
		if(str.indexOf("u")<0)
		{
			System.out.println("string is not available");
			
		}
		else
		{
			System.out.println(str.indexOf("u"));
			System.out.println("string is present");
		}
	}

}
