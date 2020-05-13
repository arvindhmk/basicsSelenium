package Practice;

public class swapstringwithouttemp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s1="Hello";
		String s2="How are you";
	
		System.out.println(s1+"=="+s2+"==>before swapping");
		
		s1=s1+s2;//HelloHow are you 16
		s2=s1.substring(0, s1.length()-s2.length());//16-11
		s1=s1.substring(s2.length());
		
		System.out.println(s1+"=="+s2+"==>After swapping");
		
		
		
	}

}
