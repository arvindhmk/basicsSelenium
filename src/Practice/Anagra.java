package Practice;

import java.util.Arrays;

public class Anagra {

	public static void main(String[] args) 
	{
	
// TODO Auto-generated method stub

		
		String x1="he is Rishvanth";		
		String x2="is he Rishvanth";
		
		//removing blank spaces
		
	x1=	x1.replaceAll(" ","");
	x2=	x2.replaceAll(" ","");
	
		//converting to lowercase string
		
	x1=	x1.toLowerCase();
	x2=	x2.toLowerCase();
		
		
		char[] x = x1.toCharArray();
		char[] y = x2.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		System.out.println(x);
		System.out.println(y);
		
		Boolean status = Arrays.equals(x, y);
		
		if(status)
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
	}

}
