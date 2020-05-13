package Practice;

public class numberofaphabetsvowelsnspecialchar 
{
	public static void main(String[] args) 
	{
		
		String checkstring="aeiou ghj *&(";
		
		checkstring=checkstring.replaceAll("\\s", "");
		
		char[] checkstr = checkstring.toCharArray();
		
		int length = checkstring.length();
		
		int vowcnt=0;
		int alphcnt=0;
		int splcnt=0;
		
		for(int i=0;i<length;i++)
		{
			if(checkstr[i]>='a'&& checkstr[i]<='z')
			{
				if(checkstr[i]=='a'||checkstr[i]=='e'||checkstr[i]=='i'||checkstr[i]=='o'||checkstr[i]=='u')
				{
					vowcnt++;
				}else
				{
					alphcnt++;
				}
			}
			else
			{
				splcnt++;
			}
		}
		
		System.out.println(vowcnt+"=="+alphcnt+"=="+splcnt);
	}

}
