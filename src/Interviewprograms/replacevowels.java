package Interviewprograms;

public class replacevowels 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String input="sillyspidErs";
		
		String str= input.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.println(str);
	}

}
