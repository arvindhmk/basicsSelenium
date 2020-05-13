package Javaprograms;

public class Replacewhitespace 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1= "hai hello how	are you";
		
		s1=s1.replaceAll("\\s","");
		System.out.println(s1);
		
	}

}
