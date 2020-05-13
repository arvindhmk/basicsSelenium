package Javaprograms;

import java.util.Scanner;

public class PalindromString2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String original;
		String reverse="";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the actual string");
		original=input.nextLine();
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		
		if(reverse.equalsIgnoreCase(original))
		{
			System.out.println("String is Palindrome");
		}
		else
			System.out.println("String is not Palindrome");
	}

}
