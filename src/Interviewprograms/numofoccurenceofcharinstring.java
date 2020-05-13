package Interviewprograms;

public class numofoccurenceofcharinstring 
{
	String s="Sillyspiders";
	char tofind='l';
	
	public void usingiterationoccurence()
	{
		
		
		int occurence=0;
		s = s.toLowerCase();	
		
		int len= s.length();
		
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)==tofind)
			{
				occurence=occurence+1; 
			}
		}
		System.out.println("Occuence==>"+occurence);
		
	}	
	
	public void withoutiteration()
	{
		
		int orglen=s.length();
		
		
				s=s.toUpperCase();
		
		System.out.println(orglen);
		
		//String chartofind= Character.toString(tofind).toUpperCase();
		
		s=s.replaceAll(Character.toString(tofind),"");
		
		int modlen=s.length();
		
		System.out.println(modlen);
	
	int occurence = orglen-modlen;
	
	System.out.println("Occuence==>"+occurence);
			
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		numofoccurenceofcharinstring occur = new numofoccurenceofcharinstring();
		//occur.usingiterationoccurence();
		occur.withoutiteration();
	}

}
