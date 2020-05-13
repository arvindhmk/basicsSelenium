package Javaprograms;

import java.util.Scanner;

public class Fibonacci
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int limit;
		int a=1;
		int b=1;
		int f;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit");
		limit=input.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=limit;i++)
		{

			f=a+b;
			System.out.println(f);
			a=b;
			b=f;
			if(f>limit)
			{
				break;
			}
		}
	}
}
