package collections;

public class deletecharfromstring 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s1="hai how are you";
		
	char[] s1ch = 	s1.toCharArray();

	
	for(int i=0;i<s1.length();i++)
	{
		if(s1ch[i]=='h')
		{
			s1=s1.replace(String.valueOf(s1ch[i]),"");
		}
	}
		
	System.out.println(s1);
}

}
