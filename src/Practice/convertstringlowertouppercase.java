package Practice;

public class convertstringlowertouppercase 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String name= "india is my country";
		
		char[] n=name.toCharArray();
		int length=name.length();
		
		for(int i=0;i<length;i++)
		{
			if(n[i]!=' ')
			{
				n[i]=(char) (n[i]-32);
			}
			
		}
		
		System.out.println(n);
	}

}
