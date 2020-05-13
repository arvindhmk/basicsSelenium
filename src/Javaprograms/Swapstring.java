package Javaprograms;

public class Swapstring 
{

	public static void main(String[] args)
	{
		
		String str1="one";
		String str2="two";
		
		String temp="";
		
		System.out.println("Before swappin str1==>"+str1);
		System.out.println("Before swappin str2==>"+str2);
		
		temp=str1;
		str1=str2;
		str2=temp;

		System.out.println("Before swappin str1==>"+str1);
		System.out.println("Before swappin str2==>"+str2);

	}
}
