package Javaprograms;

public class Countvowelsconsanantsspecialcharacters 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int vowelcnt=0;
		int conscount=0;
		int splcount=0;
		
		String s1="SUNDAY'S ARE HOLIDAY'S AS ALWAY'S";
		
		char[] ch = s1.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
			
			
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				{
					System.out.println(ch[i]+" is vowel");
					vowelcnt++;
			}
				else 
			{
				System.out.println(ch[i]+" is alphabet");
				conscount++;
			}
			}
			else
			{
				System.out.println(ch[i]+" is special characters");
				splcount++;
			}
		}
		
		System.out.println(vowelcnt);
		System.out.println(conscount);
		System.out.println(splcount);
		
	}

}
