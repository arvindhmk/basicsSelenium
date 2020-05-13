package Javaprograms;

public class Copyingstringtoanotherstring 
{

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub

		String s1="Arvindh MK";
		
		String s2="";
		
		
		char[] ch = s1.toCharArray();
		
		
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+ch[i];
		}
		System.out.println(s2);
		
	}

}
