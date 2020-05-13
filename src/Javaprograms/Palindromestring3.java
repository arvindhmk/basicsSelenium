package Javaprograms;

import java.util.Scanner;

public class Palindromestring3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Enter the String to be reversed");
		String str = input.next();
		String str2="";
		
		StringBuffer b = new StringBuffer(str);
		str2=b.reverse().toString();
		if(str.equalsIgnoreCase(str2))
		{
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
String a="dinosour";
String b1=a.substring(4);

System.out.println(b1);



	}

}
