package Javaprograms;

import java.util.Arrays;

public class Givenstringisanagram 
{

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub

	String	s1= "listen";
	String	s2="silentt";
		
		
	char[] ar1=s1.toCharArray();
	char[] ar2=s2.toCharArray();
	
	Arrays.sort(ar1);
	Arrays.sort(ar2);
	
	Boolean status =Arrays.equals(ar1, ar2);
	
	if(status)
	{
		System.out.println("Given string is Anagram");
	}else
	{
		System.out.println("Given string is not Anagram");
	}	
	}

}
