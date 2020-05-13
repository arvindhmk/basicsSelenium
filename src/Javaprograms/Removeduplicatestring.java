package Javaprograms;

public class Removeduplicatestring 
{
	
	public static String unique(String s)
	{
		String str="";
		int length = s.length();
		
		for (int i=0;i<length;i++)
		{
			char c = s.charAt(i);
			
			if(str.indexOf(c)<0)//returns negative value if c is not present
{
	str=str+c;
	
}
		}
		
		return str;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s = "geeksforgeeks";
		System.out.println(unique(s));
		
	}

}
