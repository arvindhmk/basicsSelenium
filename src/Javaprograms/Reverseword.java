package Javaprograms;

public class Reverseword 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String original = "Im am in chennai";
		
		String reverse = "";
		
		String str[] = original.split("\\s");
		
		System.out.println(str[0]);
		System.out.println(str.length);
		
		for(int i= str.length-1;i>=0;i--)
		{
		  reverse = reverse + str[i]+" ";
		  
		}
		
		System.out.println(reverse);
	}

}
