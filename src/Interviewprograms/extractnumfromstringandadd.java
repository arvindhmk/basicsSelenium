package Interviewprograms;

public class extractnumfromstringandadd 
{

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub

		String st1="Arvindh240791";
		
		st1=st1.toLowerCase();
		int total=0;
		int len=st1.length();
		
		
		for(int i=0;i<len;i++)
		{
			char ch=st1.charAt(i);
		if(Character.isDigit(ch))
		{
			total = total+Character.getNumericValue(ch);
		}
		}
		
		System.out.println(total);
	}

}
